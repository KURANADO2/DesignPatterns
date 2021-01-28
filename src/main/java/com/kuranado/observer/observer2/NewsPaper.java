package com.kuranado.observer.observer2;

/**
 * 报纸对象，继承 Subject
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:18
 */
public class NewsPaper extends Subject {

    /**
     * 报纸内容
     */
    private String content;

    /**
     * 获取抱着内容
     *
     * @return 报纸内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 更新报纸内容，同时通知读者（观察者）
     *
     * @param content 报纸内容
     */
    public void setContent(String content) {
        this.content = content;
        super.notifyObserver();
    }
}
