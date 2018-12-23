package com.kuranado.adaptor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * @Author: Xinling Jing
 * @Date: 2018-12-23 19:01
 */
public class Client {

	public static void main(String[] args) throws Exception {

		//LogModel logModel = new LogModel("0001", "这是第一条测试日志", "JING", "2018-08-03 09:44:35");
		//
		//List<LogModel> logModels = new ArrayList<>();
		//logModels.add(logModel);
		//
		//LogFileOperateApi logFileOperateApi = new LogFileOperateApiImpl("");
		//logFileOperateApi.writeLogFile(logModels);
		//List<LogModel> models = logFileOperateApi.readLogFile();
		//System.out.println(models);

		// ----------------------------------
		LogModel logModel = new LogModel("0002", "这是第二条测试日志", "JING", "2019-09-04 10:55:46");
		List<LogModel> logModels = new ArrayList<>();
		logModels.add(logModel);
		LogFileOperateApi logFileOperateApi = new LogFileOperateApiImpl("");
		LogDbOperateApi target = new Adapter(logFileOperateApi);
		target.createLog(logModel);
		System.out.println(target.getAllLog());

		//LogModel logModel = new LogModel("0001", "这是一条测试日志", "JING", "2018-08-03 09:44:35");
		//LogDbOperateApi logDbOperateApi = new LogDbOperateApiImpl();
		//logDbOperateApi.createLog(logModel);
		InputStream inputStream = new FileInputStream(new File("/Users/jing/Code/GitHub/DesignPatterns/src/main/resources/test.txt"));
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		char[] buff = new char[1024];
		int len = 0;
		while ((len = inputStreamReader.read(buff, 0, buff.length)) != -1) {
			System.out.println(buff, 0, len);
		}

	}

}
