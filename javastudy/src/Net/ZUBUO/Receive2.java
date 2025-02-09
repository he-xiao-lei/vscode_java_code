package Net.ZUBUO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receive2 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);
        InetAddress address = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(address);



        //3.创建DatagramPacket数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //4.接收数据
        ms.receive(dp);
        //5.解析数据
        int length = dp.getLength();
        String str = new String(dp.getData(),0,length);
        InetAddress ip = dp.getAddress();
        int port = dp.getPort();
        System.out.println("数据为:" + str + ",长度为" + length);
        System.out.println("是从IP为:" + ip + "的电脑,端口为" + port);
    }
}
