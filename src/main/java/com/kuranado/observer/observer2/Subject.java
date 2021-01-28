package com.kuranado.observer.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，被观察者，仅定义基本的注册观察者、取消注册、通知观察者方法，具体的更新报纸等动作放在具体的子类中
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:13
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    /**
     * 注册 读者订阅报纸
     *
     * @param observer 读者（观察者）
     */
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消注册 读者取消订阅
     *
     * @param observer 读者（观察者）
     */
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知每位已订阅的读者
     */
    public void notifyObserver() {
        // 把目标对象自身通过 update 方法传递给观察者，当观察者需要获取数据时，可以通过目标对象的引用来获取
        observers.forEach(observer -> observer.update(this));
    }
}