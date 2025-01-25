package MultipleThread.synchronizedMethod;

public class MyThread implements Runnable {
    int tickets;
    //这里的锁对象是this
    private synchronized boolean sellTickets() {
        if (tickets == 100) {
            //
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
        }
        return false;
    }

    @Override
    public void run() {
        while (true) {
            if (sellTickets()) break;
        }
    }
}
