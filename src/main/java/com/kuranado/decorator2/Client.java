package com.kuranado.decorator2;

/**
 * 使用装饰模式的客户端
 * @Author: Xinling Jing
 * @Date: 2019-02-02 16:10
 */
public class Client {

    public static void main(String[] args) {
        // 创建计算基本奖金的类，也就是被装饰的对象
        Component component = new ConcretComponent();

        Decorator decorator = new MonthPrizeDecorator(component);
        Decorator decorator1 = new SumPrizeDecorator(decorator);

        double zs = decorator1.calcPrize("张三", null, null);
        System.out.println("-----张三应得奖金:" + zs);

        double ls = decorator1.calcPrize("李四", null, null);
        System.out.println("-----李四应得奖金:" + ls);

        Decorator decorator2 = new GroupPrizeDecorator(decorator1);
        double ww = decorator2.calcPrize("王五", null, null);
        System.out.println("-----王五(经理)应得奖金:" + ww);
    }

}
