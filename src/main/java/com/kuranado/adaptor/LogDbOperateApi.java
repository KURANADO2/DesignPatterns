package com.kuranado.adaptor;

import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/7 0007 上午 9:38
 */
public interface LogDbOperateApi {

	void createLog(LogModel logModel);

	void updateLog(LogModel logModel);

	void removeLog(LogModel logModel);

	List<LogModel> getAllLog();

}