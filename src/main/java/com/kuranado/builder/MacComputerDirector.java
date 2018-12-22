package com.kuranado.builder;

        import lombok.Getter;
        import lombok.Setter;

/**
 * @Author: Xinling Jing
 * @Date: 2018-12-22 10:40
 */
@Setter
@Getter
public class MacComputerDirector implements ComputerDirector {

    private ComputerBuilder computerBuilder;

    public MacComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    @Override
    public Computer directorComputer() {

        CPU cpu = computerBuilder.buildCPU();
        Graphics graphics = computerBuilder.buildGraphics();
        HardDisk hardDisk = computerBuilder.buildHardDisk();

        // 装配电脑
        //return new Computer(cpu, graphics, hardDisk);
        return new Computer.Builder().setCpu(cpu).setGraphics(graphics).setHardDisk(hardDisk).build();
    }
}
