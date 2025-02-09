package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        //细节:一定要绑定端口
        //需要和发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(65535);
        //2.接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //该方法是阻塞的,程序执行到这里会卡住，等发送端发送消息
        System.out.println("aaaa");
        ds.receive(dp);
        System.out.println("bbbb");


        //3:解析数据包
        int length = dp.getLength();
        String str = new String(dp.getData(),0,length);
        InetAddress ip = dp.getAddress();
        int port = dp.getPort();
        System.out.println("数据为:" + str + ",长度为" + length);
        System.out.println("是从IP为:" + ip + "的电脑,端口为" + port);

        //3.释放资源
        ds.close();
    }
}
