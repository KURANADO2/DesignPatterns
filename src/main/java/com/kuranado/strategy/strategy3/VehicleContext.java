package com.kuranado.strategy.strategy3;

import lombok.Getter;

/**
 * 交通工具上下文
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-02-19 15:30
 */
@Getter
public class VehicleContext {

    /**
     * 用户名
     */
    private final String username;
    /**
     * 身份证号
     */
    private final String idNo;
    /**
     * 起始地
     */
    private final String origin;
    /**
     * 目的地
     */
    private final String destination;

    private final VehicleStrategy vehicleStrategy;

    public VehicleContext(String username, String idNo, String origin, String destination,
        VehicleStrategy vehicleStrategy) {
        this.username = username;
        this.idNo = idNo;
        this.origin = origin;
        this.destination = destination;
        this.vehicleStrategy = vehicleStrategy;
    }

    public void take() {
        this.vehicleStrategy.take(this);
    }
}
