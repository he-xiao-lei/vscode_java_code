package MultipleThread.Test;

import java.util.Random;

public class T4 {
    public static void main(String[] args) {
        /*
        微信中的抢红包也用到了多线程。
假设：100 块，分成了 3 个包。现在有 5 个人去抢。
其中，红包是共享数据。
5 个人是 5 条线程。
打印结果如下：
XXX 抢到了 XXX 元
XXX 抢到了 XXX 元
XXX 抢到了 XXX 元
XXX 没抢到
XXX 没抢到

         */
        T4Thread thread = new T4Thread("a");
        T4Thread thread1 = new T4Thread("b");
        T4Thread thread2 = new T4Thread("c");
        T4Thread thread3 = new T4Thread("d");
        T4Thread thread4 = new T4Thread("e");
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class T4Thread extends Thread {
    static final double MIN = 0.01;//最低中奖金额
    static double money = 100;//总钱数量
    static int count = 3;//共享数据，分成三个包

    public T4Thread(String name) {
        super(name);
    }


    @Override
    public void run() {

        synchronized (T4Thread.class) {
            if (count == 0) {
                //判断共享数据是否到了末尾(到了)
                System.out.println(getName() + "没有抽到红包");
            } else {
                //判断共享数据是否到了末尾(没有)
                //随机红包
                double prize;
                if (count == 1) {
                    //最后一个红包的情况
                    prize = money;
                } else {
                    //第一次第二次的情况
                    Random r = new Random();
                    //范围是100 - (3-1)*0.01
                    double bounds = money - (count - 1) * 0.01;
                    prize = r.nextDouble(bounds);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }

                //去掉抽到的钱
                money = money - prize;
                //红包个数-1
                count--;
                //打印本次获奖信息
                System.out.println(getName() + "得到了" + prize + "元红包,还剩" + money + "元");
            }
        }
    }
}

