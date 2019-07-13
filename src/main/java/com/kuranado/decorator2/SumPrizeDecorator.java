package com.kuranado.decorator2;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 *
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:59
 */
public class SumPrizeDecorator extends Decorator {

    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 获取前面计算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 每个人累计奖金 = 总的回款额 * 0.1% 此处为了简单假定所有员工的累计业务额是 1000000 元
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金:" + prize);
        return money + prize;
    }

}
