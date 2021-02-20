package com.kuranado.strategy.strategy3;

/**
 * 飞机策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 16:30
 */
public class PlaneStrategy implements VehicleStrategy {

    @Override
    public void take(VehicleContext vehicleContext) {
        VehicleContext2 vehicleContext2 = (VehicleContext2) vehicleContext;
        System.out.println(vehicleContext.getUsername() + "使用身份证：" + vehicleContext.getIdNo() + " 和登机牌："
            + vehicleContext2.getBoardingNo() + " 乘飞机从：" + vehicleContext.getOrigin() + "到：" + vehicleContext.getDestination());
    }
}
