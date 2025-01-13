package IO.Buffered;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流拷贝文件(一次一个字节数组)

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/hexiaolei/aaa/b.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/hexiaolei/aaa/b_result.txt"));

        int len;
        byte[] bytes = new byte[512];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
