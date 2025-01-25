package MultipleThread.synchronizedMethod;

public class Demo {
    public static void main(String[] args) {
        //因为这里创建的只是==一个==运行参数的对象，所以里面的参数是共用的，就不用加上static
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread, "线程1");
        Thread thread1 = new Thread(myThread, "线程2");
        Thread thread2 = new Thread(myThread, "线程3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
