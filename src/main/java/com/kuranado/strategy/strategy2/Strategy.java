package com.kuranado.strategy.strategy2;

/**
 * 策略抽象类
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 16:25
 */
public interface Strategy {

    /**
     * 计算折扣后的价格
     *
     * @param originalPrice 原价
     * @return 折扣后价格
     */
    double calcDiscountPrice(double originalPrice);
}
