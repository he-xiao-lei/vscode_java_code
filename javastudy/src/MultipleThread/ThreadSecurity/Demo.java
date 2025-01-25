package MultipleThread.ThreadSecurity;

public class Demo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        //起名字
        thread.setName("窗口1");
        thread1.setName("窗口2");
        thread2.setName("窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
