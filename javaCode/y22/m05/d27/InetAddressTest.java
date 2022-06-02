package y22.m05.d27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip);

    }
}
