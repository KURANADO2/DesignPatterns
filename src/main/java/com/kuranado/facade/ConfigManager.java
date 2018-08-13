package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 上午 11:12
 */
public class ConfigManager {

	private static ConfigManager configManager = null;
	private static ConfigModel configModel = null;

	private ConfigManager () {

	}

	public static ConfigManager getInstance() {
		if (configManager == null) {
			configManager = new ConfigManager();
			configModel = new ConfigModel();
		}
		return configManager;
	}

	public ConfigModel getConfigData() {
		return configModel;
	}

}
