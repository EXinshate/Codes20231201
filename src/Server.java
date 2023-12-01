import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
            throws IOException {
        //创建一个ServerSocket, 以监听客户端Socket的连接请求
        ServerSocket ss = new ServerSocket(30000);
        //采用循环方式不断接收来自客户端的请求
        while (true){
            //每当接到客户端Socket的请求后, 服务器端也对应产生一个Socket
            Socket s = ss.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());         //将Socket对应的输出流包装成PrintStream
            ps.println("圣诞快乐!");
            //进行普通I/O操作,输出文本
            //关闭输出流, 关闭Socket
            ps.close();
            s.close();
            ss.close();
        }
    }
}