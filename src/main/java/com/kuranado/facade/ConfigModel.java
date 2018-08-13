package com.kuranado.facade;

/**
 * @Author: Xinling Jing
 * @Date: 2018/8/13 0013 上午 11:00
 */
public class ConfigModel {

	private boolean needGenPresentation = true;
	private boolean needGenBusiness = true;
	private boolean needGenDAO = true;

	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}

	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}

	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public boolean isNeedGenDAO() {
		return needGenDAO;
	}

	public void setNeedGenDAO(boolean needGenDAO) {
		this.needGenDAO = needGenDAO;
	}
}
