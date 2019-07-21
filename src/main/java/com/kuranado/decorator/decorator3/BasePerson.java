package com.kuranado.decorator.decorator3;

import lombok.Data;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 15:59
 */
@Data
public abstract class BasePerson {

    private String name;

    public abstract String show();
}
