package ExceptionDemo.ThrowExceptions;

public class ThrowsDemo {
    public static void main(String[] args) {
        //需求：定义一个方法求数组中的最大值
//        int[] arr = {1, 2, 3, 4, 122, 22};
        int[] arr = {};

        try {
            System.out.println(getMax(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("看看我执行了吗");
    }

    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        //手动创建一个异常对象，并且把这个异常交给调用者
        //此时方法就会结束,下面的代码不会再执行了
        if (arr==null) throw new NullPointerException();
        //手动创建一个异常对象，并且把这个异常交给调用者
        //此时方法就会结束,下面的代码不会再执行了
        if (arr.length==0) throw new ArrayIndexOutOfBoundsException();
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) result = arr[i];
        }
        return result;
    }
}
