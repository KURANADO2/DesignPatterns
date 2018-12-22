package com.kuranado.builder;

/**
 * @Author: Xinling Jing
 * @Date: 2018-12-22 10:17
 */
public interface ComputerBuilder {

    CPU buildCPU();
    Graphics buildGraphics();
    HardDisk buildHardDisk();

}
