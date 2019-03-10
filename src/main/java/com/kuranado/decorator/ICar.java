package com.kuranado.decorator;

/**
 * Component 抽象构件角色
 *
 * @Author: Xinling Jing
 * @Date: 2019-01-19 12:39
 */
public interface ICar {

    void move();

}

/**
 * ConcretComponent 具体构件角色
 */
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

/**
 * Decorator 装饰角色
 */
class SuperCar implements ICar {

    private ICar iCar;

    public SuperCar(ICar iCar) {
        super();
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}

/**
 * ConcretDecoratorA 具体装饰角色
 */
class FlyCar extends SuperCar {

    public FlyCar(ICar iCar) {
        super(iCar);
    }

    public void fly() {
        System.out.println("在天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * ConcretDecoratorB 具体装饰角色
 */
class WaterCar extends SuperCar {

    public WaterCar(ICar iCar) {
        super(iCar);
    }

    public void swim() {
        System.out.println("在水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

/**
 * ConcretDecoratorC 具体装饰角色
 */
class AICar extends SuperCar {

    public AICar(ICar iCar) {
        super(iCar);
    }

    public void autoDrive() {
        System.out.println("自动陆地上驾驶");
    }

    @Override
    public void move() {
        super.move();
        autoDrive();
    }
}
