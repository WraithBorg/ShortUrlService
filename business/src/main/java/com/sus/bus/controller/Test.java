package com.sus.bus.controller;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Test {
    public static void main(String[] args) {
        String str = "appid=APPID&data=order_id=PL8988070&id=5db549153c364496424ab0b3&msg_type=order_create&nonce_str=c95eb4272b884410&station_id=T12345&ts=1572172611.975702&secret=SECRET";
        String md5 = getMD5(str);
        System.out.println(md5);
    }
    public static String getMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            byte[] digest = md.digest();
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, digest).toString(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

