package com.kuranado.proxy.proxy2;

/**
 * 定义用户数据对象接口
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:56
 */
public interface UserService {

    void setUserId(String userId);

    String getUserId();

    void setName(String name);

    String getName();

    void setDepId(String depId);

    String getDepId();

    void setSex(String sex);

    String getSex();
}
