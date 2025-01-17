package IO.ConvertStream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args)throws IOException {
        /*
        利用转换流指定的字符编码写出数据
         */
        FileWriter fw = new FileWriter("/home/hexiaolei/aaa/out_gbk_file.txt", Charset.forName("GBK"));
        fw.write("HelloWorld这是gbk编码的文件");
        fw.close();
    }
}
