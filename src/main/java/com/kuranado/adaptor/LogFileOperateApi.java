package com.kuranado.adaptor;

import java.util.List;

/**
 *
 * @Author: Xinling Jing
 * @Date: 2018-12-23 19:08
 */
public interface LogFileOperateApi {

	List<LogModel> readLogFile();

	void writeLogFile(List<LogModel> logModels);

}
