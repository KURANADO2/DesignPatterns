package com.kuranado.decorator;

/**
 * @Author: Xinling Jing
 * @Date: 2019-01-19 12:52
 */
public class Client {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();

        System.out.println("增加新的功能-飞行");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能-水上游");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加新的功能-自动驾驶");
        AICar aiCar = new AICar(car);
        aiCar.move();

        System.out.println("增加两个新的功能-飞行、水上游");
        WaterCar waterCar2 = new WaterCar(flyCar);
        waterCar2.move();
    }

}
