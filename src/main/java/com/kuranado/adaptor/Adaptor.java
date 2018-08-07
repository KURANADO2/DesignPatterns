package com.kuranado.adaptor;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/7 0007 上午 9:28
 */
public class Adaptor implements Target {

	private Adaptee adaptee;

	public Adaptor(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
