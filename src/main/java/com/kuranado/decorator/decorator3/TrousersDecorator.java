package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:21
 */
public class TrousersDecorator extends BaseDecorator {

    public TrousersDecorator(BasePerson person) {
        super(person);
    }

    @Override
    public String show() {
        return String.join(" -> ", super.show(), "穿上了裤子");
    }
}
