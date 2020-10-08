package com.kuranado.observer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象，并在自身状态发生改变时通知各个观察者
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-22 21:14
 */
public class ConcreateSubject extends Subject {

    /**
     * 目标对象状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        // 状态改变，通知所有观察者
        this.notifyObservers();
    }
}