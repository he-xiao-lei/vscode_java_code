package IO.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            字符缓冲输入流
            构造方法:
            public BufferedReader(Reader r) 把基本流变成高级流
            特有方法:
            public void readLine() 读一整行
         */
        //1.创建字符缓冲流对象
        BufferedReader brd = new BufferedReader(new FileReader("/home/hexiaolei/aaa/b.txt"));
        //2.读取一行数据
        //readLine读取一整行的数据，遇到回车换行就会结束
        //不会把回车换行读取到内存中
        String line;
        //循环,如果没有读取到内容会返回null不是-1
        while ((line = brd.readLine()) != null) {
            System.out.println(line);
        }
        //关流
        brd.close();
    }
}
