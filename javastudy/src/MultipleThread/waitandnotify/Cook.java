package MultipleThread.waitandnotify;

public class Cook extends Thread {
    //producer
    /*
        1.循环
        2.synchronized
        3.判断共享数据是否到了末尾(到了末尾)
        4.判断共享数据是否到了末尾 (没有到末尾,执行核心逻辑)
         */

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //如果没有面条就做并且修改状态为有食物并且唤醒所有这个锁绑定的所有线程
                    if (Desk.foodFlag == 0) {
                        System.out.println("又做好一份了");
                        Desk.foodFlag = 1;

                        Desk.lock.notifyAll();
                    } else {
                        try {//如果桌子上还有食物，那么就会等待
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            }
        }
    }
}
