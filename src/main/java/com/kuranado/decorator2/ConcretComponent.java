package com.kuranado.decorator2;

import java.util.Date;

/**
 * 具体的实现计算奖金的类，也是被装饰器装饰的对象
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:40
 */
public class ConcretComponent extends Component {

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 默认没有奖金
        return 0;
    }

}
