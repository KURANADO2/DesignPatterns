package com.kuranado.observer.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:13
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void subscrible(Observer observer) {
        observers.add(observer);
    }

    public void unsubscrible(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        // 把目标对象自身通过 update 方法传递给观察者，当观察者需要获取数据时，可以通过目标对象的引用来获取
        observers.forEach(observer -> observer.update(this));
    }
}