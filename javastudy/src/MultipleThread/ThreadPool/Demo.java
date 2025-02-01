package MultipleThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        //1.创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //2.提交任务
        executorService.submit(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"\ti = " +i);
            }
        });
        //如果这里main线程阻塞以后,等到线程一的内容执行完，线程一被送回到线程池，后，接下来的内容还是线程1执行
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.submit(()->{
            for (int j = 0; j < 100; j++) {
                System.out.println(Thread.currentThread().getName()+"\tj = " + j);
            }
        });
        //3.所有任务执行完毕，关闭线程池
        //销毁线程池
        executorService.shutdown();
    }
}
