package File.Test;

import java.io.File;

public class T4 {
    public static void main(String[] args) {
        //删除一个多级文件夹(有内容的)
        //步骤：先删除一个文件夹里面的所有内容
        //然后再删除自己
        File file = new File("/home/hexiaolei/aaa/src");
        deleteFile(file);
        System.out.println("Is " + file + " exists = " + file.exists());

    }

    /*
    作用：删除file文件夹
    参数：需要删除的文件夹子
     */
    public static void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            // 遍历文件夹获取里面的每一个文件
            for (File file1 : files) {
                //判断是否为文件，如果是文件就打印路径并删除
                if (file1.isFile()) {

                    System.out.println("file1.delete() = " + file1);
                    file1.delete();
                } else {
                    //如果不是文件就递归，删除里面的文件
                    deleteFile(file1);
                }
            }
            file.delete();
        }
    }
}
