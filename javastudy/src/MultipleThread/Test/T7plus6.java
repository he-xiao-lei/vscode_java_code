package MultipleThread.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class T7plus6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    /*
    多线程练习 6（多线程统计并求最大值）
在上一题基础上继续完成如下需求：
每次抽的过程中，不打印，抽完时一次性打印 (随机)
在此次抽奖过程中，抽奖箱 1 总共产⽣了 6 个奖项。
分别为：10,20,100,500,2,300 最⾼奖项为 300 元，总计额为 932 元
在此次抽奖过程中，抽奖箱 2 总共产⽣了 6 个奖项。
分别为：5,50,200,800,80,700 最⾼奖项为 800 元，总计额为 1835 元

     */
//        Array
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 3, 100, 300, 400, 500, 600, 700);
        T6MyThread thread = new T6MyThread(list, "抽奖箱子1");
        T6MyThread thread1 = new T6MyThread(list, "抽奖箱子2");

        thread.start();
        thread1.start();

    }
}

class T7MyThread extends Thread {
    //创建抽奖箱子的容器
    ArrayList<Integer> list;
    public T7MyThread(ArrayList<Integer> list, String name) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (T5Thread.class) {
                if (list.isEmpty()) {
                    //抽奖结束
                    System.out.println(getName() + boxList);
                    break;
                } else {
                    Random r = new Random();
                    int index = r.nextInt(list.size());
                    int item = list.remove(index);
                    boxList.add(item);
                }
            }
        }
    }

}


