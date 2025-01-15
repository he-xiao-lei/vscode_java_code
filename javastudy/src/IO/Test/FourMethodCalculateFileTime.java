package IO.Test;

import java.io.*;

public class FourMethodCalculateFileTime {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //1.字节流，一次一个字节  结果：循环45亿次要很久
//        method1();
        //2.字节流，一次一个字节数组    结果:7s
//        method2();
        //3.缓冲字节流，一次一个字节    结果：52s
        method3();
        //4.缓冲字节流，一次一个字节数组  结果:6s
//        method4();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000+"秒");
    }

    public static void method1() throws IOException {
        FileInputStream fr = new FileInputStream("/home/hexiaolei/download/iso_file/CentOS-7-x86_64-DVD-2009.iso");
        FileOutputStream fw = new FileOutputStream("/home/hexiaolei/test.iso");
        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }

    public static void method2() throws IOException {
        FileInputStream fr = new FileInputStream("/home/hexiaolei/download/iso_file/CentOS-7-x86_64-DVD-2009.iso");
        FileOutputStream fw = new FileOutputStream("/home/hexiaolei/test.iso");
        int len;
        byte[] bytes = new byte[8192];
        while ((len = fr.read(bytes)) != -1) {
            fw.write(bytes, 0, len);
        }
        fw.close();
        fr.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("/home/hexiaolei/download/iso_file/CentOS-7-x86_64-DVD-2009.iso"));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("/home/hexiaolei/test.iso"));
        int b;
        while ((b = bi.read()) != -1) {
            bo.write(b);
        }
        bo.close();
        bi.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("/home/hexiaolei/download/iso_file/CentOS-7-x86_64-DVD-2009.iso"));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("/home/hexiaolei/test.iso"));
        int len;
        byte[] bytes = new byte[8192];
        while ((len = bi.read(bytes)) != -1) {
            bo.write(bytes,0,len);
        }
        bo.close();
        bi.close();
    }
}
