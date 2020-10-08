package com.kuranado.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，负责注册、删除和通知观察者
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-22 21:06
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void register(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有已注册观察者
     */
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
}
