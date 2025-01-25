package MultipleThread.ThreadSecurity;

public class MyThread extends Thread {
    static int tickets;//这个类的所有对象，共享tickets这个变量

    @Override
    public void run() {
        while (true) {
            //里面写锁对象,一定是唯一的
            synchronized (MyThread.class) {
                if (tickets < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets++;
                    System.out.println(getName() + "正在卖第" + tickets + "张票");
                } else {
                    break;
                }
            }
        }
    }
}