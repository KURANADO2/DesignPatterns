package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:14
 */
public class PantsDecorator extends BaseDecorator {

    public PantsDecorator(BasePerson person) {
        super(person);
    }

    @Override
    public String show() {
        return String.join(" -> ", super.show(), "穿上了红胖次");
    }
}
