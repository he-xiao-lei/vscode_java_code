package MultipleThread.waitandnotifyQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {
    //这样创建线程的时候传入队列就可以实现生产者和消费者使用同一种队列了
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("放了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
