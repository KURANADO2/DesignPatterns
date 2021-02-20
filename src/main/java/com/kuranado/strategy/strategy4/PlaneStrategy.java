package com.kuranado.strategy.strategy4;

/**
 * 飞机策略
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 16:30
 */
public class PlaneStrategy implements VehicleStrategy {

    /**
     * 登机牌号
     */
    private final String boardingNo;

    public PlaneStrategy(String boardingNo) {
        this.boardingNo = boardingNo;
    }

    @Override
    public void take(VehicleContext vehicleContext) {
        System.out.println(vehicleContext.getUsername() + "使用身份证：" + vehicleContext.getIdNo() + " 和登机牌："
            + this.boardingNo + " 乘飞机从：" + vehicleContext.getOrigin() + "到：" + vehicleContext.getDestination());
    }
}
