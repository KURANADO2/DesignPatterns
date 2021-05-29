package com.kuranado.proxy.proxy3;

/**
 * 代理模式测试客户端
 *
 * @author Xinling Jing
 * @date 2021-05-27 16:10
 */
public class Client {

    public static void main(String[] args) {

        OrderApi orderApi = new OrderProxy(new OrderApiImpl("鸭脖", 1, "小王"));
        // 使用 OrderProxy 的 toString() 方法
        System.out.println("原始订单信息：" + orderApi);
        orderApi.setProductName("绝味鸭脖", "小李");
        orderApi.setOrderNum(1, "小李");
        orderApi.setOrderUser("小李", "小李");

        orderApi.setProductName("绝味鸭脖", "小王");
        orderApi.setOrderNum(2, "小王");
        orderApi.setOrderUser("小李", "小王");
        System.out.println("修改后订单信息：" + orderApi);
    }
}
