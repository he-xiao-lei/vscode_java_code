package MultipleThread.Test;

public class T3 {
    public static void main(String[] args) {
        /*
        同时开启两个线程，共同获取 1 - 100 之间的所有数字。
            要求：将输出所有的奇数。
         */
        T3Thread thread = new T3Thread();
        T3Thread thread1 = new T3Thread();
        thread.start();
        thread1.start();
    }
}

class T3Thread extends Thread {
    static int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (T3Thread.class) {
                if (number > 100) {
                    break;
                }else {
                    if (number%2!=0){
                        System.out.println(number);
                    }
                    number++;
                }
            }
        }
    }
}