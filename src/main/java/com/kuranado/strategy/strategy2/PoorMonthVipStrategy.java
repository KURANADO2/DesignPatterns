package com.kuranado.strategy.strategy2;

/**
 * 活动送的月度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:30
 */
public class PoorMonthVipStrategy extends StrategyTemplate {

    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice * 0.95;
    }
}
