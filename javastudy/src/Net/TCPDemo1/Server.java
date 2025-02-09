package Net.TCPDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象
        ServerSocket socket = new ServerSocket(10000);
        //2.监听客户端连接
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }

        inputStream.close();
        socket.close();

    }
}
