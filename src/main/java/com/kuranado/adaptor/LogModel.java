package com.kuranado.adaptor;

import java.io.Serializable;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/3 0003 上午 9:16
 */
public class LogModel implements Serializable {

	private static final long serialVersionUID = -2324527735778406382L;

	private String logId;
	private String logContent;
	private String operateUser;
	private String operateTime;

	public LogModel() {
	}

	public LogModel(String logId, String logContent, String operateUser, String operateTime) {
		this.logId = logId;
		this.logContent = logContent;
		this.operateUser = operateUser;
		this.operateTime = operateTime;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	@Override
	public String toString() {
		return "LogModel{" +
				"logId='" + logId + '\'' +
				", logContent='" + logContent + '\'' +
				", operateUser='" + operateUser + '\'' +
				", operateTime='" + operateTime + '\'' +
				'}';
	}
}
