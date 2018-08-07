package com.kuranado.adaptor;

import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/7 0007 上午 10:01
 */
public class Adapter implements LogDbOperateApi {

	private LogFileOperateApi adaptee;

	public Adapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void createLog(LogModel logModel) {
		List<LogModel> logModels = adaptee.readLogFile();
		logModels.add(logModel);
		adaptee.writeLogFile(logModels);
	}

	@Override
	public void updateLog(LogModel logModel) {
		List<LogModel> logModels = adaptee.readLogFile();
		for (int i = 0; i < logModels.size(); i ++) {
			if (logModels.get(i).getLogId().equals(logModel.getLogId())) {
				logModels.set(i, logModel);
				break;
			}
		}
		adaptee.writeLogFile(logModels);
	}

	@Override
	public void removeLog(LogModel logModel) {
		List<LogModel> logModels = adaptee.readLogFile();
		logModels.remove(logModel);
	}

	@Override
	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}
}
