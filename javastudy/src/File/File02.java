package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File02 {
    public static void main(String[] args) throws IOException {
        /*
| 方法名称                                      | 说明                                   |
|-------------------------------------------|--------------------------------------|
| `public boolean isDirectory()`            | 判断此路径名表示的File是否为文件夹       |
| `public boolean isFile()`                 | 判断此路径名表示的File是否为文件        |
| `public boolean exists()`                 | 判断此路径名表示的File是否存在         |

         */
        //判断文件
        File file = new File("/home/hexiaolei/JavaTestFile/a.txt");
        System.out.println(file);
        System.out.println("对一个文件路径判断");
        System.out.println("是否为文件夹:" + file.isDirectory());
        System.out.println("是否是一个文件" + file.isFile());
        System.out.println("是否存在" + file.exists());
        //判断文件夹
        File file1 = new File("/home/hexiaolei/JavaTestFile/bbb");
        System.out.println(file1);
        System.out.println("对一个文件路径判断");
        System.out.println("是否为文件夹:" + file1.isDirectory());
        System.out.println("是否是一个文件" + file1.isFile());
        System.out.println("是否存在" + file1.exists());
        //判断不存在路径
        File file2 = new File("/home/hexiaolei/JavaTestFile/ddd");
        System.out.println(file2);
        System.out.println("对一个文件路径判断");
        System.out.println("是否为文件夹:" + file2.isDirectory());
        System.out.println("是否是一个文件" + file2.isFile());
        System.out.println("是否存在" + file2.exists());

        System.out.println("--------------------------------------------");
//| `public long length()`                    | 返回文件的大小（字节数量）              |
//| `public String getAbsolutePath()`         | 返回文件的绝对路径                      |
//| `public String getPath()`                 | 返回定义文件时使用的路径                |
//| `public String getName()`                 | 返回文件的名称，带后缀                  |
//| `public long lastModified()`              | 返回文件的最后修改时间（时间毫秒值）    |
        File f = new File("/home/hexiaolei/JavaTestFile/a.txt");
        //小细节：这个方法只能获取文件的大小,单位是字节,如果要M，G的话，处以1024
        //这个方法无法获取文件夹大小
        //如果要获取文件夹大小,需要把文件夹里面所有的文件都相加
        System.out.println(f.length() / 1024/1024+"MB");
        File f1 = new File("/home/hexiaolei/JavaTestFile/bbb");
        System.out.println(f1.length());//4096是错误的

        System.out.println("--------------------------------------------");
        //2.返回绝对路径getAbsolutePath()
        File f3 = new File("javastudy/src/File/FileDemo1.java");
        System.out.println(f3.exists());
        System.out.println("f3绝对路径:"+f3.getAbsolutePath());
        //3.返回定义时的文件路径
        File f4 = new File("/home/hexiaolei/.vimrc");
        System.out.println("f4绝对路径:"+f4.getPath());

        System.out.println("--------------------------------------------");
        //4.getName()获取文件或文件夹名字
        //FileDemo1文件名
        //.java后缀名

        //获取文件夹名字
        //bbb文件夹名
        File f5 = new File("javastudy/src/File/FileDemo1.java");
        System.out.println(f5.getName());
        File f6 = new File("/home/hexiaolei/JavaTestFile/bbb");
        System.out.println(f6.getName());
        System.out.println("--------------------------------------------");
        //5.返回文件最后一次修改的时间（返回毫秒值）
        File f7 = new File("/home/hexiaolei/.vimrc");
        long time = f7.lastModified();
        Date d = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(d);
        System.out.println(format);
    }
}
