package com.kuranado.proxy.proxy3;

/**
 * 订单接口
 *
 * @author Xinling Jing
 * @date 2021-05-27 15:49
 */
public interface OrderApi {

    /**
     * 获取订单产品名称
     *
     * @return 订单产品名称
     */
    String getProductName();

    /**
     * 修改订单产品名称
     *
     * @param productName 产品名称
     * @param user        操作人
     */
    void setProductName(String productName, String user);

    /**
     * 获取订单数量
     *
     * @return 订单数量
     */
    int getOrderNum();

    /**
     * 修改订单数量
     *
     * @param orderNum 订单数量
     * @param user     操作人
     */
    void setOrderNum(int orderNum, String user);

    /**
     * 获取订单的订购者
     *
     * @return 订单的订购者
     */
    String getOrderUser();

    /**
     * 修改订单的订购者
     *
     * @param orderUser 订购人
     * @param user      操作人
     */
    void setOrderUser(String orderUser, String user);
}
