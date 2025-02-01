package MultipleThread.waitandnotify;

public class Desk {
    //锁对象
    public static final Object lock = new Object();
    //作用：控制消费者和生产者的执行顺序
    //1:有面条 0:没有面条
    public static int foodFlag = 0;
    //总个数
    public static int count = 10;

}
