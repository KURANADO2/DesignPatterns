package com.kuranado.adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/3 0003 上午 9:42
 */
public class Client {

	public static void main(String[] args) {

		LogModel logModel = new LogModel("0001", "这是一条测试日志", "JING", "2018-08-03 09:44:35");

		List<LogModel> logModels = new ArrayList<>();
		logModels.add(logModel);

		LogFileOperateApi logFileOperateApi = new LogFileOperateApiImpl("");
		logFileOperateApi.writeLogFile(logModels);
		List<LogModel> models = logFileOperateApi.readLogFile();
		System.out.println(models);

	}

}
