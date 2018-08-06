package com.kuranado.factory;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/2 0002 上午 10:35
 */
public class ApiImpl implements Api {

	@Override
	public void test(String str) {
		System.out.println("Haha " + str);
	}
}
