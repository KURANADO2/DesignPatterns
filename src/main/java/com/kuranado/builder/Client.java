package com.kuranado.builder;

/**
 * @Author: Xinling Jing
 * @Date: 2018-12-17 21:12
 */
public class Client {

    public static void main(String[] args) {

        ComputerDirector director = new MacComputerDirector(new MacComputerBuilder());
        Computer computer = director.directorComputer();
        computer.start();
    }

}
