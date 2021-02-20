package com.kuranado.strategy.strategy2;

/**
 * 年度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:31
 */
public class YearVipStrategy extends StrategyTemplate {

    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice * 0.8;
    }
}
