package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class File05 {
    public static void main(String[] args) {
        /*
        所有获取并遍历的成员方法
        | 方法名称                                         | 说明                                     |
| ------------------------------------------------ | ---------------------------------------- |
| `public static File[] listRoots()`               | 列出可用的文件系统根                     |
| `public String[] list()`                         | 获取当前该路径下所有内容                 |
| `public String[] list(FilenameFilter filter)`    | 利用文件名过滤器获取当前该路径下所有内容 |
| `public File[] listFiles()`                      | 获取当前该路径下所有内容                 |
| `public File[] listFiles(FilenameFilter filter)` | 利用文件名过滤器获取当前该路径下所有内容 |
         */
        File file = new File("/home/hexiaolei/JavaTestFile/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files));
        //listRoots获取所有盘符
        File[] files1 = File.listRoots();
        System.out.println(Arrays.toString(files1));

        //list方法，获取当前路径下的所有内容(只有文件名)
        File file1 = new File("/home/hexiaolei");
        String[] list = file1.list();
        System.out.println(Arrays.toString(list));

        //`public String[] list(FilenameFilter filter)`    | 利用文件名过滤器获取当前该路径下所有内容
        //要求获取JavaTestFile目录下所有的.txt文本文件
        File file2 = new File("/home/hexiaolei/JavaTestFile");
        String[] list1 = file2.list(new FilenameFilter() {
            @Override
            //accept方法的形参，依次表示JavaTestFile文件夹内每一个文件或者文件夹的路径
            //形参1：父级路径
            //形参2：子级路径
            //返回值为true，当前路径保留
            //       false，当前路径抛弃
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        for (String s : list1) {
            System.out.println(s);
        }
        //Lambda简写
        String[] list2 = file2.list(((dir, name) -> new File(dir, name).isFile() && name.endsWith(".txt")));
        for (String s : list2) {
            System.out.println(s);
        }

    }
}

