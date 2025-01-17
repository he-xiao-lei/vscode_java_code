package IO.ConvertStream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        转换
        在linux内将utf-8转换为gbk字符集命令为
                 源编码   目标编码         源文件           目的文件
        iconv -f utf-8 -t gbk example.txt > example.txt
         */
        //1.创建转换流对象，关联文件并且制定gbk字符集 （ 放弃）
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/hexiaolei/aaa/gbk_file.txt"), "GBK");
//        //2.读取数据
//        int b;
//        while ((b = isr.read()) != -1) {
//            System.out.print((char) b);
//        }
//        //3.释放资源
//        isr.close();
        //需要掌握的方法
        //指定字符编码读取数据
        FileReader fr = new FileReader("/home/hexiaolei/aaa/gbk_file.txt", Charset.forName("GBK"));
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
