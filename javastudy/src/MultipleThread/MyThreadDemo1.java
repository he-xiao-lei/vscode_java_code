package MultipleThread;

public class MyThreadDemo1 extends Thread{

    @Override
    public void run() {
        //书写线程需要执行的代码
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是"+getName()+"HelloWorld");
        }
    }
}
