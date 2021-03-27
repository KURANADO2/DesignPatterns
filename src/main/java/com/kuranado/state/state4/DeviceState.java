package com.kuranado.state.state4;

/**
 * 设备状态接口
 *
 * @author Xinling Jing
 * @date 2021-03-27 14:13
 */
public interface DeviceState {

    int UN_CHECK_STATE = 1;
    int CHECK_NO_NEW_STATE = 2;
    int CHECK_HAS_NEW_STATE = 3;
    int DOWNLOADING_STATE = 4;

    /**
     * 未检测
     */
    void unCheck();

    /**
     * 未检测到新版本
     */
    void checkNoNew();

    /**
     * 检测有新版本
     */
    void checkHasNew();

    /**
     * 下载中
     */
    void downloading();
}
