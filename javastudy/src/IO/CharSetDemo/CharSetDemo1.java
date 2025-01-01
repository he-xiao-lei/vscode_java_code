package IO.CharSetDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        # Java中编码的方法

| String类中的方法                                      | 说明                   |
|-------------------------------------------------------|------------------------|
| `public byte[] getBytes()`                            | 使用默认方式进行编码   |
| `public byte[] getBytes(String charsetName)`          | 使用指定方式进行编码   |

# Java中解码的方法

| String类中的方法                                      | 说明                   |
|-------------------------------------------------------|------------------------|
| `String(byte[] bytes)`                                | 使用默认方式进行解码   |
| `String(byte[] bytes, String charsetName)`            | 使用指定方式进行解码   |
         */
        //1.编码
        String str = "I'm学生";
        byte[] bytes = str.getBytes();//UTF-8,一个英文一个字节，一个中文三个字节
        System.out.println(Arrays.toString(bytes));


        byte[] bytes1 = str.getBytes("GBK");//指定为GBK,一个英文一个字节，一个中文两个字节
        System.out.println(Arrays.toString(bytes1));


        //2.解码
        String str1 = new String(bytes);
        System.out.println(str1);

        System.out.println(new String(bytes,"GBK"));
    }
}
