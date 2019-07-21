package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:01
 */
public class ConcretPerson extends BasePerson {

    ConcretPerson(String name) {
        this.setName(name);
    }

    @Override
    public String show() {
        return this.getName() + "裸体";
    }
}