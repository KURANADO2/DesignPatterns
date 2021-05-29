package com.kuranado.proxy.proxy3;

/**
 * 订单代理类（静态代理）
 *
 * @author Xinling Jing
 * @date 2021-05-27 15:55
 */
public class OrderProxy implements OrderApi {

    /**
     * 代理对象持有具体目标对象
     */
    private final OrderApiImpl orderApiImpl;

    public OrderProxy(OrderApiImpl orderApiImpl) {
        this.orderApiImpl = orderApiImpl;
    }

    @Override
    public String getProductName() {
        return orderApiImpl.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            orderApiImpl.setProductName(productName, user);
        } else {
            System.out.println("您无权限修改订单中的产品名称");
        }
    }

    @Override
    public int getOrderNum() {
        return orderApiImpl.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            orderApiImpl.setOrderNum(orderNum, user);
        } else {
            System.out.println("您无权限修改订单中的订单数量");
        }
    }

    @Override
    public String getOrderUser() {
        return orderApiImpl.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            orderApiImpl.setOrderUser(orderUser, user);
        } else {
            System.out.println("您无权限修改订单中的订购人");
        }
    }

    @Override
    public String toString() {
        return "OrderApiImpl{" +
            "productName='" + getProductName() + '\'' +
            ", orderNum=" + getOrderNum() +
            ", orderUser='" + getOrderUser() + '\'' +
            '}';
    }
}
