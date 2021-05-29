package com.kuranado.proxy;

/**
 * 代理对象
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:51
 */
public class Proxy implements Subject {

    /**
     * 具体目标对象（要被代理的对象）
     */
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {

        // 转调具体目标对象之前，可以执行一些功能处理

        // 转调具体目标对象的方法
        realSubject.request();

        // 转调具体目标对象之后，可以执行一些功能处理
    }
}
