package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 上午 11:18
 */
public class Presentation {

	public void generate() {
		ConfigModel configModel = ConfigManager.getInstance().getConfigData();
		if (configModel.isNeedGenPresentation()) {
			System.out.println("Generating presentation code");
		}
	}

}
