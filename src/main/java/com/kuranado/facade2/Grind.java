package com.kuranado.facade2;

/**
 * 磨酱
 * @Author: Xinling Jing
 * @Date: 2018/8/20 0020 下午 6:55
 */
public class Grind implements SesameOil {

	@Override
	public void execute() {
		System.out.println("芝麻放到石墨上进行磨酱，磨好的酱倒进大锅里");
	}
}
