package com.kuranado.proxy.proxy2;

/**
 * 用户数据对象接口实现类
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:59
 */
public class UserModelApiImpl implements UserService {

    private String userId;
    private String name;
    private String depId;
    private String sex;

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Override
    public String getDepId() {
        return this.depId;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getSex() {
        return this.sex;
    }
}
