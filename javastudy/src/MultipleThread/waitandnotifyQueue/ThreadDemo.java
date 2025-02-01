package MultipleThread.waitandnotifyQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        //使用阻塞队列完成消费者和生产者(等待唤醒机制)代码
        /*
            细节：生产者和消费者需要使用同一条消息队列
         */
        //泛型:里面的数据类型,参数:容量
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        Foodie foodie = new Foodie(queue);
        Cook cook = new Cook(queue);
        foodie.start();
        cook.start();
        //执行结果看起来是重复执行的，是因为方法是有锁的，但是输出语句没有锁，所以会导致重复的输出，但是数据是对的
    }
}
