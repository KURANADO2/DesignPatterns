package com.kuranado.adaptor;

import java.util.List;

/**
 *
 * @Author: Xinling Jing
 * @Date: 2018-12-23 19:15
 */
public interface LogDbOperateApi {

	/**
	 * 将日志保存到数据库
	 * @param logModel
	 */
	void createLog(LogModel logModel);

	/**
	 * 更新数据库中的日志
	 * @param logModel
	 */
	void updateLog(LogModel logModel);

	/**
	 * 删除数据库中的日志
	 * @param logModel
	 */
	void removeLog(LogModel logModel);

	/**
	 * 获取数据库中的所有日志
	 * @return
	 */
	List<LogModel> getAllLog();

}