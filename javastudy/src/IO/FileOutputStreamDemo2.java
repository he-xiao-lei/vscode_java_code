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
    }
}
