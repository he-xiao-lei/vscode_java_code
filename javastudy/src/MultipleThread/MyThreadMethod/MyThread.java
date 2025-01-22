package MultipleThread.MyThreadMethod;

public class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(100);
                System.out.println("休眠了100毫秒");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"@"+j);
        }
    }
}
