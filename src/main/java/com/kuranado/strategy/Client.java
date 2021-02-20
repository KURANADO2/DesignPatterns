package com.kuranado.strategy;

/**
 * 客户端测试
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 16:26
 */
public class Client {

    public static void main(String[] args) {

        Strategy strategy = new NormalStrategy();
        StrategyContext strategyContext = new StrategyContext(strategy);
        double result = strategyContext.calcPrice(100);
        System.out.println("普通用户折扣后价格：" + result);

        strategy = new PoorMonthVipStrategy();
        strategyContext = new StrategyContext(strategy);
        result = strategyContext.calcPrice(100);
        System.out.println("活动送的月度会员折扣后价格：" + result);

        strategy = new MonthVipStrategy();
        strategyContext = new StrategyContext(strategy);
        result = strategyContext.calcPrice(100);
        System.out.println("月度会员折扣后价格：" + result);

        strategy = new YearVipStrategy();
        strategyContext = new StrategyContext(strategy);
        result = strategyContext.calcPrice(100);
        System.out.println("年度会员折扣后价格：" + result);
    }
}
