package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        ### 字节输入流的基本用法FileInputStream

> 读取本地文件的字节流，可以把文帝文件中的数据度渠道程序中

步骤:

1. 创建字节输入流对象
    细节1：如果文件不存在，会直接报错
    输出流:不存在，创建
        把数据写到文件中(有数据)
    输入流：不存在，报错
        从文件中读取数据,数据在文件中，所以即使吧文件创建出来也是空的，没有任何意义

    程序最重要的是：数据。
2. 读数据
    细节1：一次读取一个字节，读取出来的是ASCII对应的数字
    细节2：当没有字节可以读取时会返回-1

3. 释放资源
         */
        FileInputStream fis = new FileInputStream("/home/hexiaolei/aaa/a.txt");
        //读取数据
//        int r1 = fis.read();
//        System.out.println(r1);
//        int r2 = fis.read();
//        System.out.println(r2);
//        int r3 = fis.read();
//        System.out.println(r3);
//        int r4 = fis.read();
//        System.out.println(r4);
//        int r5 = fis.read();
//        System.out.println(r5);
//        int r6 = fis.read();
//        System.out.println(r6);
//        int r7 = fis.read();
//        System.out.println(r7);//如果读取不到，会返回-1
        //字节流循环读取
        //while (fis.read() != -1) {
        //            System.out.print(fis.read());
        //        }
        //不可以这么写
        //因为read执行一次，都会读取当前字符并且移动一次指针
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
