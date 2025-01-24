package MultipleThread.YieldThread;

public class MyThread extends Thread {
    @Override
    public void run() {//有可能出让以后又抢到了，所以只能是尽可能均匀
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
            //表示出让当前CPU使用权,简单理解，用的不多
            Thread.yield();
        }
    }
}
