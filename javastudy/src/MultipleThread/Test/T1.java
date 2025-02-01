package MultipleThread.Test;

public class T1 {
    public static void main(String[] args) {
//        一共有 1000 张电影票，可以在两个窗口领取，假设每次领取的时间为 3000 毫秒，
//        要求：请用多线程模拟卖票过程并打印剩余电影票的数量
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
    }
}


class MyThread extends Thread {
    static int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (tickets == 0) {
                    break;
                } else {
                    tickets--;
                    System.out.println(getName()+"卖掉一张票，还剩" + tickets + "张票");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}