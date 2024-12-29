package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        换行写:
            Windows: \r\n
            Linux: \n
            Mac:  \r
            细节:windows中,java对换行进行了优化,会自动补全,输入\n或者\r都是可以的
            不过还是建议写全
        续写:
         */
        FileOutputStream fos = new FileOutputStream("/home/hexiaolei/aaa/a.txt");
        fos.write("我是22计算机网络技术一班的".getBytes());
        //写出一个换行符就可以实现换行了
        fos.write("\n".getBytes());

        fos.write("666".getBytes());
        fos.close();

        //续写:需要使用FileOutputStream的另外一个构造方法,第二个参数是打开续写开关，为true不会把文件删除后在写入，而是在原有的基础上写入
        //如果参数为false（默认）,会先把文件删除后在写入
        FileOutputStream fos1 = new FileOutputStream("/home/hexiaolei/aaa/a.txt",true);
        fos1.write("你好，我是续写的内容".getBytes());
        fos1.close();
    }
}
