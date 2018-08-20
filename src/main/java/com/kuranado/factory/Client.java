package com.kuranado.factory;

import java.util.ArrayList;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 下午 4:27
 */
public class Client {

	public static void main(String[] args) {
		ExportOperate exportOperate = new ExportDBOperate();
		exportOperate.export("测试数据");
	}

}
