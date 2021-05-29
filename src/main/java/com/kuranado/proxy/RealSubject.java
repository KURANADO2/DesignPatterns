package com.kuranado.proxy;

/**
 * 具体的目标对象，是真正被代理的对象
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:50
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        // 执行具体的功能处理
    }
}
