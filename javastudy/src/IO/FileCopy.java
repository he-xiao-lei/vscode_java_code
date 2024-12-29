package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("/home/hexiaolei/RosanMedia.mp4");
        FileOutputStream output = new FileOutputStream("/home/hexiaolei/aaa/b.mp4");
        int b;
        long start = System.currentTimeMillis();
        while ((b = input.read()) != -1) {
            output.write((char) b);
        }
        long end = System.currentTimeMillis();
        //释放资源规则
        //掀开的后释放

        output.close();
        input.close();
        System.out.println("end-start = " + (end - start) / 1000 + "s");
    }
}
