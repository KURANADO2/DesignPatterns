package com.kuranado.strategy.strategy3;

import lombok.Getter;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 16:33
 */
@Getter
public class VehicleContext2 extends VehicleContext {

    /**
     * 登机牌号
     */
    private final String boardingNo;

    public VehicleContext2(String username, String idNo, String origin, String destination,
        VehicleStrategy vehicleStrategy, String boardingNo) {
        super(username, idNo, origin, destination, vehicleStrategy);
        this.boardingNo = boardingNo;
    }
}
