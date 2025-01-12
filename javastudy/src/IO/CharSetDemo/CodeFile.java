package IO.CharSetDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CodeFile {
    public static void main(String[] args) throws IOException {
        /*
       **文件加密**

为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。

**加密原理：**
对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。

**解密原理：**
读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
           ^ : 异或
           两边相同 : false
           两边不同 : true
         */


        System.out.println(true ^ true);
        System.out.println(false ^ true);

        //数字异或计算
        System.out.println(100 ^ 10);
        /*
        原理:
        100:1100100
        10:1010

        1100100
      ^ 0001010
        ----------
        1101110 十进制:110
        第二次计算110 ^ 10
        1101110
        0001010
        ----------
        1100100 十进制:100
         */
        System.out.println(110 ^ 10);


        System.out.println("开始");
//        code();
        encode();
    }
    public static void code() throws IOException {
        FileInputStream fip = new FileInputStream("/home/hexiaolei/aaa/泰坦钱包地址.txt");
        FileOutputStream fop = new FileOutputStream("/home/hexiaolei/aaa/code.txt");
        int b;
        while ((b=fip.read())!=-1){
            fop.write(b ^ 100);
        }
        fop.close();
        fip.close();
    }
    public static void encode() throws IOException {
        FileInputStream fip = new FileInputStream("/home/hexiaolei/aaa/code.txt");
        FileOutputStream fop = new FileOutputStream("/home/hexiaolei/aaa/encode.txt");
        int b;
        while ((b=fip.read())!=-1){
            fop.write(b ^ 100);
        }
        fop.close();
        fip.close();
    }

}
