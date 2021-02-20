package com.kuranado.strategy;

/**
 * 普通会员的折扣策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:29
 */
public class NormalStrategy implements Strategy {

    @Override
    public double calcDiscountPrice(double originalPrice) {
        return originalPrice;
    }
}
