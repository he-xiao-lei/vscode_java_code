package MultipleThread;

public class MyThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {//t1 t2 如果是t1执行到这个方法，那这里的t就是t1
            //获取当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"---"+i);
        }
    }
}
