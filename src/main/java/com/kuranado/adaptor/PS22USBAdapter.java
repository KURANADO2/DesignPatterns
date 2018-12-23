package com.kuranado.adaptor;

/**
 * PS2 到 USB 转接口（适配器）
 * @Author: Xinling Jing
 * @Date: 2018-12-23 13:43
 */
public class PS22USBAdapter implements USBTarget {

    private PS2KeyboardAdaptee adaptee;

    @Override
    public void handleRequest() {
        adaptee.specificRequest();
    }

    public PS22USBAdapter(PS2KeyboardAdaptee adaptee) {
        this.adaptee = adaptee;
    }
}
