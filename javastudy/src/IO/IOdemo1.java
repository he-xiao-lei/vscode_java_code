package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOdemo1 {
    public static void main(String[] args) throws IOException {
        /*
       FileOutputStream

    > 操作本地文件的字节输出流,可以把程序中的数据写入到文件中

    书写步骤:

    1. 创建字节输出流对象
        细节1： 参数是字符串或者是File对象都是可以的
            public FileOutputStream(String name) throws FileNotFoundException {
            this(name != null ? new File(name) : null, false);
    }
    源代码是这样写的
        细节2：如果文件不存在系统会自动创建一个，但是父路径必须存在
        细节3：如果文件已经存在，会把以存在文件内容清除在写入数据
    2. 写入数据
        细节1：write的方法是整数，但是实际上写到本地文件的是ASCII码表对应的字符
        97 --> a
    3. 释放资源
        每次使用完流以后，都需要释放
         */
        //1.创建对象
        //写入 输出流OutputStream
        //文件 File

        FileOutputStream fos = new FileOutputStream("/home/hexiaolei/aaa/z.txt");
        //2.写出数据
        fos.write(97);
        //3.释放资源
        fos.close();
    }
}
