package MultipleThread.PriorityThread;

public class Demo1 {
    public static void main(String[] args) {
        //创建线程要执行的参数对象
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        //创建线程
        Thread t1 = new Thread(threadDemo1, "坦克");
        Thread t2 = new Thread(threadDemo1, "飞机");

        System.out.println("t1.getPriority() = " + t1.getPriority());//线程默认优先级是5
        System.out.println("t2.getPriority() = " + t2.getPriority());//线程默认优先级是5
        t1.setPriority(1);
        t2.setPriority(10);
//        Thread thread = new Thread();main线程
//        System.out.println("main线程优先级 = " + thread.getPriority());
        t1.start();
        t2.start();
    }
}
