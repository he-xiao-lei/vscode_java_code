package MultipleThread.YieldThread;

public class ThreadDemo {
    public static void main(String[] args) {
        //yield礼让线程

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();


        thread1.setName("张三");
        thread2.setName("李四");

        thread1.start();
        thread2.start();
    }
}
