package com.kuranado.factory;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 2:59
 */
public class ExportTxtFileOperate extends ExportOperate {

	@Override
	ExportApi factoryMethod() {
		return new ExportTxtFile();
	}

}
