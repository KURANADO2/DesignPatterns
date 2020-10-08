package com.kuranado.observer;

/**
 * 观察者接口，定义一个更新的接口给哪些在目标发生改变时被通知的对象
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-22 21:07
 */
public interface Observer {

    /**
     * 用于更新
     *
     * @param subject 目标对象
     */
    void update(Subject subject);
}
