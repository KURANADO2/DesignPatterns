package com.kuranado.strategy.strategy2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 14:31
 */
public abstract class StrategyTemplate implements Strategy {

    @Override
    public double calcDiscountPrice(double originalPrice) {
        System.out.println("增加消费积分：" + originalPrice);
        return calcPrice(originalPrice);
    }

    protected abstract double calcPrice(double originalPrice);
}
