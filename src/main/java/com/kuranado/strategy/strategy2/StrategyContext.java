package com.kuranado.strategy.strategy2;

/**
 * 策略上下文
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 19:36
 */
public class StrategyContext {

    private final Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calcPrice(double originalPrice) {
        return this.strategy.calcDiscountPrice(originalPrice);
    }
}
