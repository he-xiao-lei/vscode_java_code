package IO.Buffered;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流拷贝文件
        //创建缓冲区对象
        BufferedInputStream fip = new BufferedInputStream(new FileInputStream("/home/hexiaolei/aaa/b.txt"));//可以手动制定缓冲区大小
        BufferedOutputStream fop = new BufferedOutputStream(new FileOutputStream("/home/hexiaolei/aaa/b_result.txt"));
        int b;
        while ((b = fip.read()) != -1) {
            fop.write(b);
        }
        fop.close();
        fip.close();
    }
}
