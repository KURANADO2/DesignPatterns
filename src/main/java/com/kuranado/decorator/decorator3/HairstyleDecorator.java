package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:25
 */
public class HairstyleDecorator extends BaseDecorator {

    public HairstyleDecorator(BasePerson person) {
        super(person);
    }

    @Override
    public String show() {
        return String.join(" -> ", super.show(), "梳了一个性感的发型");
    }
}
