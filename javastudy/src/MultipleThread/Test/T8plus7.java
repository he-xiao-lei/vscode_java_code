package MultipleThread.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T8plus7 {
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
        MyCallable myCallable = new MyCallable(list);
        //线程1管理者
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        //线程2管理者
        FutureTask<Integer> futureTask1 = new FutureTask<>(myCallable);
        Thread thread1 = new Thread(futureTask);
        Thread thread2 = new Thread(futureTask1);
        thread1.start();
        thread2.start();
        if (futureTask.get()>futureTask1.get()){
            System.out.println("\"线程1有最大的红包\" = "+futureTask.get());
        }else {
            System.out.println("\"线程2有最大的红包\" = " + futureTask1.get() );
        }

    }
}

class MyCallable implements Callable<Integer> {
    //创建抽奖箱子的容器
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public Integer call() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (T5Thread.class) {
                if (list.isEmpty()) {
                    //抽奖结束
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    Random r = new Random();
                    int index = r.nextInt(list.size());
                    int item = list.remove(index);
                    boxList.add(item);
                }
            }
        }

    return Collections.max(boxList);
    }

}


