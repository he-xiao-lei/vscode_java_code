package Net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        /*
        static InetAddress getByName(String host) 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName()    获取此IP地址的主机名
        String getHostAddress()    返回文本显示中的IP地址字符串
         */
        //获取InetAddress对象
        InetAddress ubuntu = Inet4Address.getByName("ubuntu");
        String hostAddress = ubuntu.getHostAddress();
        String hostname = ubuntu.getHostName();
        System.out.println("hostAddress = " + hostAddress);
        System.getenv().entrySet().stream().filter(x -> x.getKey().equals("LANG")).forEach(System.out::println);
    }
}
