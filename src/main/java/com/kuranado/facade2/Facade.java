package com.kuranado.facade2;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/21 0021 上午 10:53
 */
public class Facade {

	private Facade() {}

	public static void powerOn() {
		new Fry().execute();
		new Grind().execute();
		new Stir().execute();
	}

}
