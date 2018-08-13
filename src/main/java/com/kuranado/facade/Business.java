package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 上午 11:18
 */
public class Business {

	public void generate() {
		ConfigModel configModel = ConfigManager.getInstance().getConfigData();
		if (configModel.isNeedGenBusiness()) {
			System.out.println("Generating bussiness code");
		}
	}

}
