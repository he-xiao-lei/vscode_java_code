package File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class File05_2 {
    public static void main(String[] args) {
//| `public File[] listFiles(FilenameFilter filter)` | 利用文件名过滤器获取当前该路径下所有内容 |
//| `public File[] listFiles(FileFilter filter)`     | 利用文件名过滤器获取当前该路径下所有内容 |
        //1.创建文件对象
        File file = new File("/home/hexiaolei/JavaTestFile/");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files));

        //跟new FileFilter区别就是这个是父路径和子路径，上面那个是两个在一起了
        File[] files1 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        System.out.println("Arrays.toString(files1) = " + Arrays.toString(files1));
    }
}
