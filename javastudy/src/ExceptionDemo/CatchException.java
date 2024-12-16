package ExceptionDemo;

public class CatchException {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3};
        try {
            System.out.println(arr[9]);//此处出现了问题，程序会在这里创建一个ArrayIndexOutOfBoundsException对象
                                        //new ArrayIndexOutOfBoundsException();
                                        //拿到catch里面对比，看括号里的变量是否可以接受这个对象
                                        //如果能接收，那就代表异常被捕获，执行catch里面的代码
                                        //执行完以后会继续执行其他代码
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        }
        System.out.println("我执行了");
    }
}
