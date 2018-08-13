package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 上午 11:18
 */
public class DAO {

	public void generate() {
		ConfigModel configModel = ConfigManager.getInstance().getConfigData();
		if (configModel.isNeedGenDAO()) {
			System.out.println("Generating DAO code");
		}
	}

}
