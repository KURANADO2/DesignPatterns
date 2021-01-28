package com.kuranado.observer.observer2;

/**
 * 观察者接口
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:13
 */
public interface Observer {

    /**
     * 接收通知的方法
     *
     * @param subject 具体的目标对象
     */
    void update(Subject subject);
}