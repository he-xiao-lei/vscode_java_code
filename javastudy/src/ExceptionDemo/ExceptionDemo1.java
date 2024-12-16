package ExceptionDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        //编译时异常(需要手动处理，否则就会报错),Java不会运行代码，只会检查是否有语法错误和是否可以优化一下语法,提醒程序员检查本地信息
        String time = "2021-11-2";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(time);
        System.out.println(date);

        //运行时异常,为了提醒是否
        int[] arr = {1,2,3};
        System.out.println(arr[4]);
    }
}
