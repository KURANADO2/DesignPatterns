package com.kuranado.decorator2;

import java.util.Date;
import java.util.Map;

/**
 * 装饰器对象，计算当月团队业务奖金
 * @Author: Xinling Jing
 * @Date: 2019-02-02 16:03
 */
public class GroupPrizeDecorator extends Decorator {

    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 获取前面计算出来的奖金
        double money = super.calcPrize(user, begin, end);
        double prize = 0.0;
        for (Map.Entry<String, Double> entry : TempDB.getMonthSaleMoneyMap().entrySet()) {
            prize += entry.getValue();
        }
        prize = prize * 0.01;
        System.out.println(user + "当月团队业务奖金:" + prize);
        return money + prize;
    }

}
