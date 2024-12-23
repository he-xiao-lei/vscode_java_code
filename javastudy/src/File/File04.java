package File;

import java.io.File;
import java.util.Arrays;

public class File04 {
    public static void main(String[] args) {
        /*
        File的成员方法(获取和遍历)
        | 方法名                    | 说明                     |
        | ------------------------- | ------------------------ |
        | public File[] listFiles() | 获取当前路径下的所有内容 |
         */
        //1.创建File对象
        File file = new File("/home/hexiaolei/JavaTestFile/aaa");
        //2.listFiles方法
        //作用：获取JavaTestFile文件夹内所有的内容
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        //当调用者File表示的路径不存在时，返回null
        //当调用者File表示的路径是文件，返回null
        //当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        //当调用者File表示的路径是一个有内容的文件夹时,会将里面所有文件和文件夹的路径放在File数组中返回,如果有隐藏文件，也会包含进去
        //当调用者File表示的路径是一个需要权限才能访问的文件夹时，返回null

//        for (File f : files) {
//            //f表示其中的每一个元素
//            System.out.println(f);
//        }


    }
}
