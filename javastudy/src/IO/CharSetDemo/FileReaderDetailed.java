package IO.CharSetDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDetailed {
    public static void main(String[] args) throws IOException {
//        FileWriter fr = new FileWriter("/home/hexiaolei/aaa/all_all_a.txt");
//
//
//        for (int i = 0; i < 8192; i++) {
//            fr.write(97);
//        }
//
//        fr.write(98);
//
//
//        fr.close();
//

        //有一种情况,
        FileReader fileReader = new FileReader("/home/hexiaolei/aaa/all_all_a.txt");
        //会把数据放到缓冲区
        fileReader.read();
        //不加append参数会把文件内容清空
        FileWriter fileWriter = new FileWriter("/home/hexiaolei/aaa/all_all_a.txt");


        int ch;
        //这里会从缓冲区里面读取
        while ((ch = fileReader.read()) != -1) {
            System.out.println((char) ch);
        }
        //解释：还是可以读取到文件内容的，因为第一次read的时候，filereader会把数据放到缓冲区，然后filewrite会把文件内容清空但是不会把缓冲区清空
        //所以现在只能读取缓冲区里面的内容,读取完就没有了
        //所以这里结果就是全都是a
        fileWriter.close();
        fileReader.close();
    }
}
