package Net.TCPDemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        //TCP协议，传输数据
        //链接服务端
        //如果连接不到就会报ConnectException连接异常
        //建立连接
        Socket socket = new Socket("127.0.0.1", 10000);
        //2.获取输出流
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("你好我是一个中国人".getBytes());
        //3.关流
        outputStream.close();
        socket.close();
    }
}
