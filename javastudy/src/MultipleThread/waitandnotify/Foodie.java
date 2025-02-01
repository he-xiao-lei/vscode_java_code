package MultipleThread.waitandnotify;


public class Foodie extends Thread {
    //Consumer

    @Override
    public void run() {
        /*
        1.循环
        2.synchronized
        3.判断共享数据是否到了末尾(到了末尾)
        4.判断共享数据是否到了末尾 (没有到末尾,执行核心逻辑)
         */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        // 如果没有，就等待
                        try {//等待时会释放锁
                            Desk.lock.wait();//让当前线程被这个锁绑定，唤醒的时候就可以操作了
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // 把吃的总数 - 1
                        Desk.count--;
                        // 如果有，就开吃
                        System.out.println("吃了一碗面条还可以吃" + Desk.count + "碗面条");
                        // 吃完之后，唤醒厨师继续做
                        Desk.lock.notify();
                        // 修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
