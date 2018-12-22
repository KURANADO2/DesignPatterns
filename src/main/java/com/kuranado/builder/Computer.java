package com.kuranado.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * 电脑类
 * @Author: Xinling Jing
 * @Date: 2018-12-21 15:01
 */
@Setter
@Getter
public class Computer {

    private CPU cpu;
    private Graphics graphics;
    private HardDisk hardDisk;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.graphics = builder.graphics;
        this.hardDisk = builder.hardDisk;
    }

    public void start() {
        System.out.println("开机中...");
    }

    public static class Builder {

        private CPU cpu;
        private Graphics graphics;
        private HardDisk hardDisk;



        Computer build() {
            return new Computer(this);
        }
    }
}

class Hardware {

    /**
     * 品牌
     */
    private String brand;
    /**
     * 型号
     */
    private String model;

    public Hardware(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

/**
 * CPU
 */
class CPU extends Hardware {

    /**
     * Cache
     */
    private String cache;

    public CPU(String brand, String model, String cache) {
        super(brand, model);
        this.cache = cache;
    }
}

/**
 * 显卡
 */
class Graphics extends Hardware {

    /**
     * 显存
     */
    private String videoMemory;

    public Graphics(String brand, String model, String videoMemory) {
        super(brand, model);
        this.videoMemory = videoMemory;
    }
}

/**
 * 硬盘
 */
class HardDisk extends Hardware {

    /**
     * 硬盘容量
     */
    private String capacity;

    public HardDisk(String brand, String model, String capacity) {
        super(brand, model);
        this.capacity = capacity;
    }
}