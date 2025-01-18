package IO.PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        构造方法	说明
public PrintWriter(Write/File/String)	关联字节输出流 / 文件 / 文件路径
public PrintWriter(String fileName, Charset charset)	指定字符编码
public PrintWriter(Write w, boolean autoFlush)	自动刷新
public PrintWriter(OutputStream out, boolean autoFlush, Charset charset)	指定字符编码且自动刷新
成员方法	说明
public void write(...)	常规方法：规则跟之前一样，写出字节或者字符串
public void println(Xxx xx)	特有方法：打印任意类型的数据并且换行
public void print(Xxx xx)	特有方法：打印任意类型的数据，不换行
public void printf(String format, Object... args)	特有方法：带有占位符的打印语句
         */
        //1.创建字符打印流对象
        PrintWriter pw = new PrintWriter(new FileWriter("/home/hexiaolei/aaa/printwriter.txt"),true);
        //2.写出数据
        pw.println("你好我是hhh");
        //只打印，不换行
        pw.print("aaa");
        pw.printf("%s fuck %s","a","b");
        pw.close();

        //获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        //特殊的打印流，系统中的标准输出流,不能被关闭
        PrintStream out = System.out;
        out.println("aaa");
    }
}
