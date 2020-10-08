package com.kuranado.observer;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-22 21:27
 */
public class ConcreateObserver implements Observer {

    /**
     * 观察者的状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {
        // 具体更新实现
    }
}
