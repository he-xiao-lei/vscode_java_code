package MultipleThread.Test;

public class T2 {
    public static void main(String[] args) {
        /*
       有 100 份礼品，两人同时发送，当剩下的礼品小于 10 份的时候则不再送出。利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来。
         */
        T2Thread thread = new T2Thread("小明");
        T2Thread thread1 = new T2Thread("李磊");
        thread.start();
        thread1.start();
    }
}

class T2Thread extends Thread {
    static int presents = 100;

    public T2Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (T2Thread.class) {
                if (presents == 10) {
                    break;
                } else {
                    presents--;
                    System.out.println(getName()+"送出一份礼物,还有" + presents + "份");
                }
            }
        }
    }
}