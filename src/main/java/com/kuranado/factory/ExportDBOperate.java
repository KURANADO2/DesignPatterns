package com.kuranado.factory;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 4:24
 */
public class ExportDBOperate extends ExportOperate {

	@Override
	ExportApi factoryMethod() {
		return new ExportDB();
	}

}
