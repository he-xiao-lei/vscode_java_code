package MultipleThread.ManualLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int tickets;//这个类的所有对象，共享tickets这个变量

    //创建锁对象,防止每创建一个线程就创建一个锁，这样的话就没有创建锁的意义了
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synchronized (MyThread.class) {
            lock.lock();

            try {
                if (tickets == 100000) {
                    break;
                } else {
                    Thread.sleep(1);
                    tickets++;
                    System.out.println(getName() + "正在卖第" + tickets + "张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //不管怎么样都会执行
                lock.unlock();
            }
        }
    }


//            }
}