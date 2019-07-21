package com.kuranado.decorator.decorator2;

import java.util.Date;

/**
 * 装饰器接口，需要和被装饰的对象实现同样的接口
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:42
 */
public abstract class Decorator extends Component {

    /**
     * 持有被装饰构建对象的引用
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 转调构建对象的方法
        return component.calcPrize(user, begin, end);
    }

}
