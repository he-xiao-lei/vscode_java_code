package MultipleThread.DaemonThread;

public class DaemonThreadDemo {

    public static void main(String[] args) {
    /*
        final void setDaemon(boolean on)设置为守护线程
        细节：
            当其他非守护线程执行完毕以后，守护线程会陆续结束
        通俗易懂的解释:
            当非守护线程结束了，守护线程也会结束j
   */
        DaemonThread1 thread1 = new DaemonThread1();
        DaemonThread2 thread2 = new DaemonThread2();
        thread1.setName("女神");
        thread2.setName("备胎");

        //把第二个线程设置为守护线程
        thread2.setDaemon(true);


        thread1.start();
        thread2.start();


    }
}
