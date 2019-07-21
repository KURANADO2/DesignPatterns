package com.kuranado.decorator.decorator2;

import java.util.Date;

/**
 * 装饰器对象，计算当月业务奖金
 *
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:45
 */
public class MonthPrizeDecorator extends Decorator {

    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 获取前面计算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 每个人当月业务奖金 = 当月销售额 * 3%
        double prize = TempDB.getMonthSaleMoneyMap().get(user) * 0.03;
        System.out.println(user + "当月奖金:" + prize);
        return money + prize;
    }

}
