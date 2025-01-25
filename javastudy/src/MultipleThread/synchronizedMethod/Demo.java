package MultipleThread.synchronizedMethod;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread, "线程1");
        Thread thread1 = new Thread(myThread, "线程2");
        Thread thread2 = new Thread(myThread, "线程3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
