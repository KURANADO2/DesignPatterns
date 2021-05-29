package com.kuranado.proxy.proxy3;

/**
 * 订单接口实现类
 *
 * @author Xinling Jing
 * @date 2021-05-27 15:52
 */
public class OrderApiImpl implements OrderApi {

    private String productName;
    private int orderNum;
    private String orderUser;

    public OrderApiImpl(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return this.orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }

    @Override
    public String toString() {
        return "OrderApiImpl{" +
            "productName='" + productName + '\'' +
            ", orderNum=" + orderNum +
            ", orderUser='" + orderUser + '\'' +
            '}';
    }
}
