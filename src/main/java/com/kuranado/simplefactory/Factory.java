package com.kuranado.simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/2 0002 上午 10:32
 */
public class Factory {

	//public static Api createApi(int type) {
	//
	//	Api api = null;
	//
	//	if (type == 1) {
	//		api = new ApiImpl();
	//	} else if (type == 2) {
	//		api = new ApiImpl2();
	//	}
	//
	//	return api;
	//}

	public static Api createApi() {
		Properties prop = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = Factory.class.getResourceAsStream("/FactoryTest.properties");
			System.out.println(inputStream);
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Api api = null;

		try {
			api = (Api) Class.forName(prop.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}

}
