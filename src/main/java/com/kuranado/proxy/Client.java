package com.kuranado.proxy;

/**
 * 代理模式测试客户端
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:54
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new Proxy(realSubject);
        subject.request();
    }
}
