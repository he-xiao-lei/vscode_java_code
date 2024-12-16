package File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        | 方法名称                                   | 说明                                               |
| ------------------------------------------ | -------------------------------------------------- |
| `public File(String pathname)`             | 根据文件路径创建文件对象                           |
| `public File(String parent, String child)` | 根据父路径名字符串和子路径名字符串创建文件对象     |
| `public File(File parent, String child)`   | 根据父路径对应文件对象和子路径名字符串创建文件对象 |
         */

        //根据字符串表示的路径创建File对象
        File file = new File("/home/hexiaolei/JavaTestFile/a.txt");
        System.out.println(file);

        //根据父路径/home/hexiaolei/JavaTestFile/和子路径a.txt创建File对象
        String parent = "/home/hexiaolei/JavaTestFile/";
        String child = "b.txt";
        File file1 = new File(parent, child);
        System.out.println(file1);


        //把一个File对象和String字符串拼接
        File file2 = new File("/home/hexiaolei/JavaTestFile/");
        String child1 = "c.txt";
        File file3 = new File(file2,child1);
        System.out.println(file3);
    }
}
