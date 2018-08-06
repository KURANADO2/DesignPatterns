package com.kuranado.adaptor;

import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/3 0003 上午 9:18
 */
public interface LogFileOperateApi {

	List<LogModel> readLogFile();

	void writeLogFile(List<LogModel> logModels);

}
