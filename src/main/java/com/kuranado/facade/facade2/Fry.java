package com.kuranado.facade.facade2;

/**
 * 炒芝麻
 * @Author: Xinling Jing
 * @Date: 2018/8/20 0020 下午 6:54
 */
public class Fry implements SesameOil {

	@Override
	public void execute() {
		System.out.println("将芝麻放到旋转的炒锅里炒上 40 分钟，直至芝麻出烟");
	}

}
