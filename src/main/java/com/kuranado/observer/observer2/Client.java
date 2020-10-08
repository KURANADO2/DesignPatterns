package com.kuranado.observer.observer2;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-23 21:25
 */
public class Client {

    public static void main(String[] args) {

        NewsPaper newYorkTimes = new NewsPaper();

        Reader reader = new Reader();
        reader.setName("小李");
        Reader reader2 = new Reader();
        reader2.setName("小王");
        Reader reader3 = new Reader();
        reader3.setName("小赵");

        newYorkTimes.subscrible(reader);
        newYorkTimes.subscrible(reader2);
        newYorkTimes.subscrible(reader3);

        newYorkTimes.setContent("任达华3厘米刀伤");
    }
}