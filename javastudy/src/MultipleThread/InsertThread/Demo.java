package MultipleThread.InsertThread;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        DemoThread t1 = new DemoThread();
        t1.setName("土豆");
        t1.start();

        //表示把t1这个线程插入到当前线程之前
        //t1表示土豆线程,当前线程表示main线程
        t1.join();


        //执行再main线程上的
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程"+i);
        }
    }
}
