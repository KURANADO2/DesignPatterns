package com.kuranado.decorator.decorator2;

import java.util.Date;

/**
 * 计算奖金的组件接口
 *
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:37
 */
public abstract class Component {

    /**
     * 计算员工在某段时间内的奖金
     *
     * @param user  被计算奖金的员工
     * @param begin 计算奖金的开始时间
     * @param end   计算奖金的结束时间
     * @return 该员工在某段时间内的奖金
     */
    public abstract double calcPrize(String user, Date begin, Date end);

}