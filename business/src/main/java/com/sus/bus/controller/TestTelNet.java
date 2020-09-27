package com.sus.bus.controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TestTelNet {
    public static boolean telnet(String hostname, int port, int timeout) {
        Socket socket = new Socket();
        boolean isConnected = false;
        try {
            socket.connect(new InetSocketAddress(hostname, port), timeout); // 建立连接
            isConnected = socket.isConnected(); // 通过现有方法查看连通状态
        } catch (IOException e) {
            System.out.println("false");        // 当连不通时，直接抛异常，异常捕获即可
        } finally {
            try {
                socket.close();   // 关闭连接
            } catch (IOException e) {
                System.out.println("false");
            }
        }
        return isConnected;
    }

    public static void main(String[] args) {
        String hostname = "www.baidu.com";    // hostname 可以是主机的 IP 或者 域名
        int port = 80;
        int timeout = 200;
        boolean isConnected = telnet(hostname, port, timeout);
        System.out.println("telnet " + hostname + " " + port + "\n==>isConnected: " + isConnected);
    }
}

