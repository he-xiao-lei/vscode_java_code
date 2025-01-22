package MultipleThread.MyThreadMethod;

public class MyThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //常见成员方法
        /*
                String getName () 返回此线程的名称
                void setName (String name)设置线程的名字（构造方法也可以设置名字）
                细节：
                    如果没有给线程设置名字，线程也是由默认名字的，格式为:Thread-(id)从0开始
                    如果要给线程设置名字，可以用set方法设置，也可以通过构造方法实现(构造方法不可以继承，需要使用super)
                static Thread currentThread ()获取当前线程的对象
                细节：
                    当JVM启动以后，会启动多条线程，
                    其中有一条就叫main他的作用就是调用main方法，并执行里面的代码
                    之前编写的所有方法都是运行在main线程中

                static void sleep (long time)让线程休眠指定的时间，单位为毫秒
                细节：
                    1.哪条线程执行到这个方法，哪条线程就会在这里停留对应的时间
                    2.停留时间跟参数有关
                    3.当时间到了以后线程会自动醒来然后执行接下来的代码
         */
        Thread.sleep(5000);
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        thread1.start();
        thread2.start();
        new Thread(()-> System.out.println("Fuck"),"线程3").start();
    }
}
