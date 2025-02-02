package MultipleThread.CustomerThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);
//        参数一：核心线程数量：不能小于 0。
//        参数二：最大线程数：不能小于等于 0，且最大数量需大于等于核心线程数量。
//        参数三：空闲线程最大存活时间：不能小于 0。
//        参数四：时间单位：用TimeUnit指定。
//        参数五：任务队列：不能为空（null）。
//        参数六：创建线程工厂：不能为空（null）。
//        参数七：任务的拒绝策略：不能为空（null）。
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());
//        threadPoolExecutor.submit(()->{
//            for (int i = 0; i < 100; i++) {
//            }
//        })
        int poolSize = threadPoolExecutor.getPoolSize();
        System.out.println("poolSize = " + poolSize);

    }
}
