package com.kuranado.strategy;

/**
 * 月度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:30
 */
public class MonthVipStrategy implements Strategy {

    @Override
    public double calcDiscountPrice(double originalPrice) {
        return originalPrice * 0.9;
    }
}
