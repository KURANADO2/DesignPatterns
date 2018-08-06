package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/2 0002 下午 5:51
 */
public class Facade {

	public void test() {
		AModuleApi aModuleApi = new AModuleApiImpl();
		aModuleApi.testA();
		BModuleApi bModuleApi = new BModuleApiImpl();
		bModuleApi.testB();
		CModuleApi cModuleApi = new CModuleApiImpl();
		cModuleApi.testC();
	}

}
