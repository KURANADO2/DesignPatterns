package com.kuranado.factory;

/**
 * 实现导出数据业务功能的对象
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 2:38
 */
abstract class ExportOperate {

	/**
	 * 导出数据
	 * @param data
	 * @return
	 */
	void export(String data) {
		ExportApi exportFileApi = factoryMethod();
		exportFileApi.export(data);
	}

	/**
	 * 工厂方法
	 * @return 导出文件对象的接口的对象
	 */
	abstract ExportApi factoryMethod();

}
