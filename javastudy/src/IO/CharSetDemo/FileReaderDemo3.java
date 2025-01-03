package IO.CharSetDemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo3 {
    public static void main(String[] args) throws IOException {

        //| `public int read(char[] buffer)` | 读取多个数据，读到末尾返回-1 |
        FileReader fileReader = new FileReader("/home/hexiaolei/aaa/a.txt");

        char[] chars = new char[13];
        //读取到的长度
        int len;
        //read(char)底层原理:读取数据，解码，强制转换，把强转以后的字符放到数组中
        //空参的read+强制类型转换
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fileReader.close();
        System.out.println();

    }
}
