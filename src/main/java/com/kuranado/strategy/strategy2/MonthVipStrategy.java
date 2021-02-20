package com.kuranado.strategy.strategy2;

/**
 * 月度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:30
 */
public class MonthVipStrategy extends StrategyTemplate {

    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice * 0.9;
    }
}
