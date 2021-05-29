package com.kuranado.proxy.proxy4;

import com.kuranado.proxy.proxy3.OrderApi;
import com.kuranado.proxy.proxy3.OrderApiImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 订单代理类（动态代理）
 *
 * @author Xinling Jing
 * @date 2021-05-27 16:46
 */
public class DynamicOrderProxy implements InvocationHandler {

    /**
     * 被代理对象
     */
    private OrderApi orderApi;

    /**
     * 获取代理接口
     */
    public OrderApi getProxyInterface(OrderApiImpl orderApiImpl) {
        this.orderApi = orderApiImpl;
        // 注意 Java 动态代理只能用于接口，所以只能强转为 OrderApi，而不能强转为 OrderApiImpl
        return (OrderApi) Proxy.newProxyInstance(orderApiImpl.getClass().getClassLoader(),
            orderApiImpl.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")) {
            if (orderApi.getOrderUser() != null && orderApi.getOrderUser().equals(args[1])) {
                return method.invoke(orderApi, args);
            } else {
                System.out.println("您无权限修改订单中的任何数据");
            }
        } else {
            return method.invoke(orderApi, args);
        }
        return null;
    }
}
