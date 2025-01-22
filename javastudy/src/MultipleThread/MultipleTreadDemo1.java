package MultipleThread;

public class MultipleTreadDemo1 {
    public static void main(String[] args) {
        //start()表示开启线程
        MyThreadDemo1 myThreadDemo1 = new MyThreadDemo1();
        MyThreadDemo1 myThreadDemo2 = new MyThreadDemo1();
        myThreadDemo1.setName("线程1");
        myThreadDemo2.setName("线程2");
        myThreadDemo1.start();
        myThreadDemo2.start();

    }
}
