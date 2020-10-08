package com.kuranado.observer.observer2;

import lombok.Data;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:20
 */
@Data
public class Reader implements Observer {

    private String name;

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到新报纸,内容为:" + ((NewsPaper)subject).getContent());
    }
}
