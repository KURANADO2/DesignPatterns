package com.kuranado.strategy.strategy3;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 16:11
 */
public class Client {

    public static void main(String[] args) {

        VehicleStrategy vehicleStrategy = new TrainStrategy();
        VehicleContext vehicleContext = new VehicleContext("林克", "1001", "上海", "北京", vehicleStrategy);
        vehicleContext.take();

        vehicleStrategy = new PlaneStrategy();
        vehicleContext = new VehicleContext2("塞尔达", "1002", "浦东国际机场", "日本成田机场", vehicleStrategy, "1234");
        vehicleContext.take();
    }
}
