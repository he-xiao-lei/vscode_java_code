package File.Test;

import java.io.File;

public class T2 {
    public static void main(String[] args) {
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影
        //（不需要考虑子文件夹）
        File file = new File("/home/hexiaolei/aaa");
        System.out.println("isAviSuffix(file) = " + isAviSuffix(file));

    }

    public static boolean isAviSuffix(File file) {
        //遍历文件夹，将所有文件或者文件夹都添加到files数组中
        File[] files = file.listFiles();
        for (File f : files) {
            //f:代表数组里面的每一个文件或者文件夹的路径
            if (f.isFile() && f.getName().endsWith(".avi")) {
                System.out.println("file1 = " + f);
                return true;
            }
        }
        return false;
    }
}
