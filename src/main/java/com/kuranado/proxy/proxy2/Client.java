package com.kuranado.proxy.proxy2;

import java.util.List;

/**
 * 代理模式测试客户端
 *
 * @author Xinling Jing
 * @date 2021-04-28 09:50
 */
public class Client {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        List<UserService> users = userManager.listUsers();
        // 只查看用户基础信息：用户 Id 和用户名
        for (UserService user : users) {
            System.out.println("用户 Id：" + user.getUserId() + " 用户名：" + user.getName());
        }
        // 除了用户基础信息，还想查看用户更详细的信息：性别和所属部门
        for (UserService user : users) {
            System.out.println("用户 Id：" + user.getUserId() + " 用户名：" + user.getName()
            + " 用户性别：" + user.getSex() + " 所属部门：" + user.getDepId());
        }
    }
}
