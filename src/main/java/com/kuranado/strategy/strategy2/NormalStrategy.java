package com.kuranado.strategy.strategy2;

/**
 * 普通会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:29
 */
public class NormalStrategy extends StrategyTemplate {

    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice;
    }
}
