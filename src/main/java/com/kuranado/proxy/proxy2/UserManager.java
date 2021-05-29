package com.kuranado.proxy.proxy2;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理类
 *
 * @author Xinling Jing
 * @date 2021-05-27 14:15
 */
public class UserManager {

    public List<UserService> listUsers() {

        List<UserService> userModelApis = new ArrayList<>();

        // 查询数据库
        System.out.println("从数据库查询用户 Id 和姓名");
        Proxy p1 = new Proxy(new UserModelApiImpl());
        p1.setUserId("001");
        p1.setName("小李");

        Proxy p2 = new Proxy(new UserModelApiImpl());
        p2.setUserId("002");
        p2.setName("小野");

        userModelApis.add(p1);
        userModelApis.add(p2);

        return userModelApis;
    }
}
