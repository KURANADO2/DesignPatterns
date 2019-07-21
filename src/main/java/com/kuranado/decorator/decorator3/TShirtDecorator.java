package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:23
 */
public class TShirtDecorator extends BaseDecorator {

    public TShirtDecorator(BasePerson person) {
        super(person);
    }

    @Override
    public String show() {
        return String.join(" -> ", super.show(), "穿上了 T 恤");
    }
}
