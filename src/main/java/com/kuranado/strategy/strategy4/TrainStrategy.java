package com.kuranado.strategy.strategy4;

/**
 * 火车策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 16:20
 */
public class TrainStrategy implements VehicleStrategy {

    @Override
    public void take(VehicleContext vehicleContext) {
        System.out.println(vehicleContext.getUsername() + "使用身份证：" + vehicleContext.getIdNo() + " 乘火车从："
            + vehicleContext.getOrigin() + "到：" + vehicleContext.getDestination());
    }
}
