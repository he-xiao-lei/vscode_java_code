package IO.CharSetDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDetailed {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/hexiaolei/aaa/fw.txt");
        //如果缓冲区装满了就会写入文件
//        for (int i = 0; i < 513; i++) {
//            fw.write(97);
//        }
        //手动刷新
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
//        将在缓冲区里的数据写入文件
        fw.flush();
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");

        System.out.println();
        //如果不关流或者刷新，就不会写入文件，还会在缓冲区里面
    }
}
