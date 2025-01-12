package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFileCopybit {
    public static void main(String[] args) throws IOException {
        /*
        | 方法名称                         | 说明                   |
| -------------------------------- | ---------------------- |
| `public int read()`              | 一次读一个字节数据     |
| `public int read(byte[] buffer)` | 一次读一个字节数组数据 |
         */
//        FileInputStream fis = new FileInputStream("/home/hexiaolei/aaa/a.txt");
//        FileOutputStream fos = new FileOutputStream("/home/hexiaolei/newRosan.mp4");
        //一次读取多少字节数据，具体读取多少，跟数组长度有关
        //返回值(len)：一次读取到多少个字节数据
//        int len = fis.read(bytes);
//        String str = new String(bytes);//(str)读取到的数据
//        System.out.println(str);


//        byte[] bytes = new byte[2];
//        int len;
//        len = fis.read(bytes);//0,0
//        System.out.println(new String(bytes));//ab
//        len = fis.read(bytes);//97,98
//        System.out.println(new String(bytes));//99,100
//        len = fis.read(bytes);//99,100
//        System.out.println(new String(bytes));//101,10

//        运行结果
        /*
        解释:
        因为是Linux操作系统,所以换行符是LF
        第一次读取到ab，存储到数组中,打印
        第二次读取到cd，覆盖之前的ab，打印
        第三次读取到e和回车符号,覆盖cd，打印
        第四次打印len时由于没有新字符了所以返回-1,
        最后一次打印由于没有清空数组，导致内容还是e和回车符号
         */


//        想要改变，可以使用这一种方式

//        int len1;//读取到的字节长度
//        byte[] bytes = new byte[2];
//        len1 = fis.read(bytes);
//        System.out.println(new String(bytes, 0, len1));
//        len1 = fis.read(bytes);
//        System.out.println(new String(bytes, 0, len1));
//        //前四个已经读取完毕，这里只剩e和换行符,所以读取长度还是2
//        len1 = fis.read(bytes);
//        System.out.println(new String(bytes, 0, len1 - 1));
//        int read = fis.read(bytes);
//        System.out.println("read = " + read);
//
//        fis.close();
//        System.out.println("hello\nWorld");


        //FileCopy改写
        FileInputStream fileInputStream = new FileInputStream("/home/hexiaolei/centos.iso");
        FileOutputStream fileOutputStream = new FileOutputStream("/home/hexiaolei/a.iso");


        byte[] bytes1 = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fileInputStream.read(bytes1)) != -1) {
            fileOutputStream.write(bytes1,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
