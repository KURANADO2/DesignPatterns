package com.kuranado.observer.observer2;

import lombok.Data;

/**
 * 读者 具体的观察者，实现观察者接口
 *
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:20
 */
@Data
public class Reader implements Observer {

    /**
     * 读者姓名
     */
    private String name;
    // 可增加读者的其它属性 ...，此处省略

    @Override
    public void update(Subject subject) {
        // 拉模式
        System.out.println(name + "收到新报纸，内容为：" + ((NewsPaper) subject).getContent());
    }
}
