package com.kuranado.observer.observer2;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:18
 */
public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        super.notifyObserver();
    }
}
