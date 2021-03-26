package com.kuranado.state.state3;

/**
 * @version 1.0.0
 * @author: Xinling Jing
 * @date: 2021-03-16 22:25
 */
public abstract class DeviceState {

    protected StateContext stateContext;

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    /**
     * 未检测
     */
    public abstract void unCheck();

    /**
     * 未检测到新版本
     */
    public abstract void checkNoNew();

    /**
     * 检测有新版本
     */
    public abstract void checkHasNew();

    /**
     * 下载中
     */
    public abstract void downloading();

}
