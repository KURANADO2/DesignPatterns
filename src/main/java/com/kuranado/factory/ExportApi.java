package com.kuranado.factory;

/**
 * 导出文件对象的接口
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 2:18
 */
public interface ExportApi {

	/**
	 * 导出内容为文件
	 * @param data 要导出的内容
	 * @return 是否导出成功
	 */
	public boolean export(String data);

}
