package com.kuranado.factory;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 2:23
 */
public class ExportDB implements ExportApi {

	@Override
	public boolean export(String data) {
		System.out.println("正在导出" + data + "到数据库");
		return true;
	}
}
