package IO.CharSetDemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {

//| 成员方法                         | 说明                         |
//| -------------------------------- | ---------------------------- |
//| `public int read()`              | 读取数据，读到末尾返回-1     |
//| `public int read(char[] buffer)` | 读取多个数据，读到末尾返回-1 |
        //1.创建对象
        FileReader fileReader = new FileReader("/home/hexiaolei/aaa/a.txt");
        //2.读取数据read(),底层也是字节流，默认一个字节一个字节读取，遇到中文会一次读取多个
        int ch;
        //空参read细节:默认按照字节读取，如果遇到中文就一次读取多个,
        //读取之后：方法底层将会进行解码并且转换为十进制
        //最后将这个十进制作为返回值
        //这个十进制也表示在字符集上的数字
        //英文:文件里面的数据 0110 0001
        //  read进行读取:解码转换为十进制97
        //中文：文件里面数据 11100110 10110001 10001001
        //  read进行读取：解码转换为十进制 27721
        //看到实际字符可以强转
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch+"\t");
            System.out.print(ch + "\t");
        }
        //3.释放资源
        fileReader.close();
    }
}
