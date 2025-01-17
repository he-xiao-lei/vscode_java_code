package IO.ConvertStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
        ////1. 字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
        ////2. 字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
//        //字节流
//        FileInputStream fis  = new FileInputStream("/home/hexiaolei/aaa/a.txt");
//        //转换流
//        InputStreamReader isr = new InputStreamReader(fis);
//        //字符缓冲流
//        BufferedReader br = new BufferedReader(isr);
//        String line = br.readLine();
//        System.out.println(line);
//        br.close();

        //最终代码
        //这一条代码意思是缓冲字符流里包装了转换流，转换流里面包装了字节流
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/hexiaolei/aaa/a.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //使用字节流会乱码的代码
//        FileInputStream fis = new FileInputStream("/home/hexiaolei/aaa/a.txt");
//        int b;
//        while ((b=fis.read())!=-1){
//            System.out.println((char)b);
//        }
    }
}
