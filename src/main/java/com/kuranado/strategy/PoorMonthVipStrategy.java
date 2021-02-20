package com.kuranado.strategy;

/**
 * 活动送的月度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:30
 */
public class PoorMonthVipStrategy implements Strategy {

    @Override
    public double calcDiscountPrice(double originalPrice) {
        return originalPrice * 0.95;
    }
}
