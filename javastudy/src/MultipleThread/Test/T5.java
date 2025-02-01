package MultipleThread.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class T5 {
    public static void main(String[] args) {
        /*
        有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700}；
创建两个抽奖箱 (线程)，设置线程名称分别为 “抽奖箱 1”，“抽奖箱 2”
随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
每次抽出一个奖项就打印一个 (随机)
抽奖箱 1 又产生了一个 10 元大奖
抽奖箱 1 又产生了一个 100 元大奖
抽奖箱 1 又产生了一个 200 元大奖
抽奖箱 1 又产生了一个 800 元大奖
抽奖箱 2 又产生了一个 700 元大奖
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 3, 100, 300, 400, 500, 600, 700);
        T5Thread thread = new T5Thread(list,"抽奖箱子1");
        T5Thread thread1 = new T5Thread(list,"抽奖箱子2");
        thread.start();
        thread1.start();
    }
}

class T5Thread extends Thread {

    ArrayList<Integer> list;

    public T5Thread(ArrayList<Integer> list, String name) {
        super(name);
        this.list = list;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (T5Thread.class) {
                if (list.isEmpty()) {
                    break;
                } else {
                    Random r = new Random();
                    int i = r.nextInt(list.size());
                    System.out.println(getName() + "出现了大奖" + list.get(i));
                    list.remove(i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
