package IO.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/hexiaolei/aaa/b_result.txt"));
        //2.写出数据
        bw.write("fuck you");
        //换行
        bw.newLine();
        bw.write("love you");
        //3.关流
        bw.close();

    }
}
