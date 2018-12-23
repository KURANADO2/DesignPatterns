package com.kuranado.adaptor;

import lombok.Data;

import java.io.Serializable;

/**
 * 日志类
 * @Author: Xinling Jing
 * @Date: 2018-12-23 19:01
 */
@Data
public class LogModel implements Serializable {

	private static final long serialVersionUID = -2324527735778406382L;

	private String logId;
	/**
	 * 日志内容
	 */
	private String logContent;
	/**
	 * 操作人
	 */
	private String operateUser;
	/**
	 * 操作时间
	 */
	private String operateTime;

	public LogModel() {
	}

	public LogModel(String logId, String logContent, String operateUser, String operateTime) {
		this.logId = logId;
		this.logContent = logContent;
		this.operateUser = operateUser;
		this.operateTime = operateTime;
	}
}
