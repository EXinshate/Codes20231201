import java.net.*;
public class InetAddressyong{
    public static void main(String[] args)
            throws Exception{
        //根据主机名获取对应的InetAddress实例
        InetAddress ip = InetAddress.getByName ("douban.com/");
        //判断是否可达
        System.out.println("sohu是否可达:" + ip. isReachable(2000));
        //获取该InetAddress实例的IP字符串
        System.out.println(ip.getHostAddress());
        //根据原始IP地址获取对应的InetAddress实例
        InetAddress local = InetAddress. getByAddress(new byte[]
                {127,0,0,1});
        System.out.println("本机是否可达: " + local.isReachable(5000));
        //获取该InetAddress实例对应的全限定域名
        System.out.println(local.getCanonicalHostName());
    }
}