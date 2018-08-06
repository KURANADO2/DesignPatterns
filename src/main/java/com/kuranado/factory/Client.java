package com.kuranado.factory;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/2 0002 上午 10:41
 */
public class Client {

	public static void main(String[] args) {
		//Api api = Factory.createApi(2);
		Api api = Factory.createApi();
		api.test("Xiaoming");
	}

}
