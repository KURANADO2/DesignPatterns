package com.kuranado.adaptor;

/**
 * 电脑客户端类
 * @Author: Xinling Jing
 * @Date: 2018-12-23 13:31
 */
public class ComputerClient {

    public void test(USBTarget target) {
        target.handleRequest();
    }

    public static void main(String[] args) {
        ComputerClient client = new ComputerClient();
        PS2KeyboardAdaptee adaptee = new PS2KeyboardAdaptee();
        USBTarget target = new PS22USBAdapter(adaptee);
        client.test(target);
    }

}
