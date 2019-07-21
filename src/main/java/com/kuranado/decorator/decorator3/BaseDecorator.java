package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:01
 */
public abstract class BaseDecorator extends BasePerson {

    private BasePerson person;

    public BaseDecorator(BasePerson person) {
        this.person = person;
    }

    @Override
    public String show() {
        return person.show();
    }
}