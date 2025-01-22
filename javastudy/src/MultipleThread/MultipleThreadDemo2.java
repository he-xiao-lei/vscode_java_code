package MultipleThread;

public class MultipleThreadDemo2 {
    public static void main(String[] args) {
        /*
        多线程的第二种启动方式
         1.自己创建一个类继承Runnable接口
         2.重写里面的run方法
         3.创建一个类的对象
         4.创建一个Thread类对象并且把自己创建的类放进去，然后开启线程
         */
        //创建MyThreadDemo2的对象
        MyThreadDemo2 myThreadDemo2 = new MyThreadDemo2();
        //创建线程对象
        Thread t1 = new Thread(myThreadDemo2);
        Thread t2 = new Thread(myThreadDemo2);
        //设置名字
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
