package com.kuranado.proxy.proxy2;

/**
 * 代理对象，代理用户数据对象
 *
 * @author Xinling Jing
 * @date 2021-04-27 09:59
 */
public class Proxy implements UserService {

    /**
     * 代理对象持有具体目标对象
     */
    private final UserModelApiImpl realSubject;

    private boolean loaded = false;

    public Proxy(UserModelApiImpl realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getDepId() {

        if (!this.loaded) {
            // 从数据库中重新查询数据
            reload();
            this.loaded = true;
        }

        return realSubject.getDepId();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    @Override
    public String getSex() {

        if (!this.loaded) {
            // 从数据库中重新查询数据
            reload();
            this.loaded = true;
        }

        return realSubject.getSex();
    }

    private void reload() {
        String userId = realSubject.getUserId();
        // 根据用户 Id 从数据库查询用户详细信息：部门 Id 和 性别
        // queryUserInfoByUserIdFromDb(userId)
        System.out.println("从数据库查询用户部门 Id 和性别");
        if ("001".equals(userId)) {
            realSubject.setDepId("101");
            realSubject.setSex("男");
        }
        if ("002".equals(userId)) {
            realSubject.setDepId("101");
            realSubject.setSex("女");
        }
    }

}
