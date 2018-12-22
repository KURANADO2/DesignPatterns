package com.kuranado.builder;

/**
 * @Author: Xinling Jing
 * @Date: 2018-12-22 10:19
 */
public class MacComputerBuilder implements ComputerBuilder {

    @Override
    public CPU buildCPU() {
        System.out.println("构建 Mac CPU");
        return new CPU("Intel", "Xeon W", "19MB");
    }

    @Override
    public Graphics buildGraphics() {
        System.out.println("构建 Mac 显卡");
        return new Graphics("AMD", "Radeon Pro Vega 56", "8GB");
    }

    @Override
    public HardDisk buildHardDisk() {
        System.out.println("构建 Mac 硬盘");
        return new HardDisk("三星", "SM128C", "2TB");
    }
}
