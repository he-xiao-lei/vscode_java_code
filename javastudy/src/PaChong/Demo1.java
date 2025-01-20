package PaChong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //定义变量记录网址
        String str1 = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String str2 = "http://www.haoming8.cn/baobao/10881.html";
        String str3 = "http://www.haoming8.cn/baobao/7641.html";


        //将爬取得所有数据拼接为一个字符串
        String familyName = webClawler(str1);
        String boyName = webClawler(str2);
        String girlName = webClawler(str3);
        //获取需要的数据（正则表达式）
        ArrayList<String> date = getDate(familyName, "([\\u4e00-\\u9fa5]{4})((，|。))",1);
        String string = date.toString();
        System.out.println(string);


        ArrayList<String> date1 = getDate(boyName, "(..)(、|。)",1);
        String string1 = date1.toString();
        System.out.println(string1);
//        System.out.println(s);
//        System.out.println(boyName);
//        System.out.println(girlName);
    }

    /*
    作用:根据正则表达式获取字符串中的数据
    参数1：
        数据
    参数2:
        正则表达式
    参数3:
        ？？？




        ArrayList用来作临时的储存
     */
    private static ArrayList<String> getDate(String date, String regex,int index) {
        //创建几个存储数据
        ArrayList<String> list = new ArrayList<>();
        //按照正则表达式规则，去获取数据
        Pattern pattern= Pattern.compile(regex);
        //按照pattern的规则到str里获取数据
        Matcher matcher = pattern.matcher(date);
        while (matcher.find()){
            String group = matcher.group(index);
            list.add(group);
        }

        return list;
    }


    /*
    作用：
        从网络里面爬取数据
    形参：
        网址
    返回值：
        爬取的数据
     */
    public static String webClawler(String url) throws IOException {
        //1.定义StringBuilder拼接数据
        StringBuilder sb = new StringBuilder();
        //2.创建url对象
        URL url1 = new URL(url);
        //3.链接网址
        //细节：保证网络畅通且可以链接
        URLConnection urlConnection = url1.openConnection();
        //4.读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
           sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
