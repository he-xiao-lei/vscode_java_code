package MultipleThread.ManualLock;

public class Demo {
    public static void main(String[] args) {
        //因为这里创建的只是==一个==运行参数的对象，所以里面的参数是共用的，就不用加上static
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();


        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
