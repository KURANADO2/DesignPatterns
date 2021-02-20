package com.kuranado.strategy;

/**
 * 年度会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:31
 */
public class YearVipStrategy implements Strategy {

    @Override
    public double calcDiscountPrice(double originalPrice) {
        return originalPrice * 0.8;
    }
}
