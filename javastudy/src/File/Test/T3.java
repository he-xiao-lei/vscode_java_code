package File.Test;

import java.io.File;

public class T3 {
    public static void main(String[] args) {
        //找到电脑里所有以mp4结尾的电影
        File file = new File("/home/hexiaolei/");
        findAVI(file);
    }

    public static void findAVI(File file) {
        //1.进入文件夹src
        //如果listFiles的调用者是需要权限的目录或者不存在的目录会为null
        File[] src = file.listFiles();
        //所以这里加一个判断
        if (src != null) {
            //2.遍历数组，找到每一个文件或者文件夹
            for (File file1 : src) {
                if (file1.isFile()) {
                    //3.判断是否为avi结尾的电影
                    //4.判断是否还有下一个文件夹
                    if (file1.getName().endsWith(".mp4")) System.out.println(file1);
                } else {
                    findAVI(file1);
                }
            }
        }
    }
}
