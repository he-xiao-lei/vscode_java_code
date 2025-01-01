package IO.CharSetDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo1 {
    public static void main(String[] args) throws IOException {


        /*
        | 构造方法                                      | 说明                             |
|-----------------------------------------------|----------------------------------|
| `public FileWriter(File file)`                | 创建字符输出流关联本地文件       |
| `public FileWriter(String pathname)`          | 创建字符输出流关联本地文件       |
| `public FileWriter(File file, boolean append)`| 创建字符输出流关联本地文件，续写 |
| `public FileWriter(String pathname, boolean append)`| 创建字符输出流关联本地文件，续写 |
         */
        /*
        | 成员方法                                    | 说明                   |
| ------------------------------------------- | ---------------------- |
| `void write(int c)`                         | 写出一个字符           |
| `void write(String str)`                    | 写出一个字符串         |
| `void write(String str, int off, int len)`  | 写出一个字符串的一部分 |
| `void write(char[] cbuf)`                   | 写出一个字符数组       |
| `void write(char[] cbuf, int off, int len)` | 写出字符数组的一部分   |
         */
        FileWriter fw = new FileWriter("/home/hexiaolei/aaa/filewrite.txt");
        fw.write(25105);//根据字符集编码方式进行编码，然后把编码之后的数据写入到文件之中
        fw.write("你好聪明？？？");
        fw.close();
    }
}
