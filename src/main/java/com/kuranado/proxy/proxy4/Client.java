package com.kuranado.proxy.proxy4;

import com.kuranado.proxy.proxy3.OrderApi;
import com.kuranado.proxy.proxy3.OrderApiImpl;

/**
 * 动态代理测试客户端
 *
 * @author Xinling Jing
 * @date 2021-05-27 17:44
 */
public class Client {

    public static void main(String[] args) {
        DynamicOrderProxy dynamicOrderProxy = new DynamicOrderProxy();
        // 代理接口
        OrderApi proxyInterface = dynamicOrderProxy.getProxyInterface(new OrderApiImpl("鸭脖", 1, "小王"));
        // 使用 OrderApiImpl 类的 toString() 方法
        System.out.println("原始订单信息：" + proxyInterface);
        proxyInterface.setProductName("绝味鸭脖", "小李");
        proxyInterface.setOrderNum(1, "小李");
        proxyInterface.setOrderUser("小李", "小李");

        proxyInterface.setProductName("绝味鸭脖", "小王");
        proxyInterface.setOrderNum(2, "小王");
        proxyInterface.setOrderUser("小李", "小王");
        System.out.println("修改后订单信息：" + proxyInterface);
    }
}
