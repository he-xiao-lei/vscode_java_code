package MultipleThread;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MultipleThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*
    多线程第三种实现方式:
        特点：可以获取到多线程运行返回的结果
         1. 创建一个类MyCallable实现Callable接口
         2. 重写call()方法,有返回值，表示多线程返回的结果
         3. 测试类中，先创建MyCallable对象(表示多线程要执行的任务)
         4. 创建FutureTask对象(作用是管理多线程运行的结果)
         5. 创建Thread对象,并且启动
         6.启动
     */
        MyCallable myCallable = new MyCallable();
        FutureTask<Map<String,String>> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        //方法作用是获取多线程的结果
        System.out.println("futureTask.get() = " + futureTask.get());
    }
}
