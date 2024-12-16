package ExceptionDemo;

public class ExceptionMethod {
    public static void main(String[] args) {
//       | 方法名称                      | 说明                              |
//| ----------------------------- | --------------------------------- |
//| public String getMessage()    | 返回此 throwable 的详细消息字符串 |
//| public String toString()      | 返回此可抛出的简短描述            |
//| public void printStackTrace() | 把异常的错误信息输出在控制台      |
        int[] arr = {1, 2, 3};


//        try {
//            System.out.println(arr[4]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("=====getMessage()=====");
//            String str = e.getMessage();
//            System.out.println(str);//Index 4 out of bounds for length 3
//            System.out.println("====toString======");
//            String str1 = e.toString();
//            System.out.println(str1);
//            System.out.println("====printStackTrace======");//常用,底层使用System.err.println输出,把异常信息以红色字体输出到控制台，不会影响正常程序运行
//            e.printStackTrace();
//        }
//        System.out.println("看看我执行了吗");
//

        System.out.println("扩展");//System.err
        System.out.println("正常输出语句");
        System.out.println(123);
        System.out.println("异常输出语句(指红色字体打印出来)");
        System.err.println(123);//作了解
    }
}
