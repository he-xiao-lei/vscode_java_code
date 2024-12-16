package ExceptionDemo;

public class ExceptionSelf {
    public static void main(String[] args) {
        /*
- 如果try中没有问题，该怎么执行



- 如果try中有多个问题，该怎么办

         */
        int[] arr = new int[]{1, 2, 3};
        try {
            System.out.println(arr[4]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("看看我执行了吗");

        try{
            System.out.println(arr[9]);
            System.out.println("我执行了吗");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(arr[7]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
