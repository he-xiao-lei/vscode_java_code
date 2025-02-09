package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //发送数据
        //1.创建DatagramSocket对象
        //细节:
        //绑定端口,以后我们就是通过这个端口向外发送
        //空参：随机选择一个端口
        //有参：指定端口号绑定
        DatagramSocket ds = new DatagramSocket(55555);
        //2.打包数据
        String str = "你好帅阿，认识一下";
        byte[] bytes = str.getBytes();
        InetAddress ip = InetAddress.getByName("ubuntu");
        int port = 65535;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, port);

        ds.send(dp);

        ds.close();
    }
}
