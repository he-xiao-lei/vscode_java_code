package IO.ConvertStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //读取gbk文件，写出为utf-8
        FileReader fr = new FileReader("/home/hexiaolei/aaa/gbk_file.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("/home/hexiaolei/aaa/gbk_file_out.txt", StandardCharsets.UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write((char) ch);
        }
        fw.close();
        fr.close();
    }
}
