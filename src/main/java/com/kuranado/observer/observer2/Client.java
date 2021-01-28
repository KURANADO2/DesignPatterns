package com.kuranado.observer.observer2;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:25
 */
public class Client {

    public static void main(String[] args) {

        // 纽约时报报纸
        NewsPaper newYorkTimes = new NewsPaper();

        Reader reader = new Reader();
        reader.setName("小李");
        Reader reader2 = new Reader();
        reader2.setName("小王");
        Reader reader3 = new Reader();
        reader3.setName("小赵");

        // 读者订阅报纸
        newYorkTimes.subscribe(reader);
        newYorkTimes.subscribe(reader2);
        newYorkTimes.subscribe(reader3);

        // 纽约时报报纸更新内容
        newYorkTimes.setContent("任达华 3 厘米刀伤");

        // 小李取消订阅
        newYorkTimes.unsubscribe(reader);

        // 纽约时报报纸更新内容
        newYorkTimes.setContent("民航局:春节期间机票可免费退改");
    }
}