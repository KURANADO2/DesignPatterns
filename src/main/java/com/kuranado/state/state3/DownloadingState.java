package com.kuranado.state.state3;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 16:02
 */
public class DownloadingState extends DeviceState {

    @Override
    public void unCheck() {
        // do nothing
        System.out.println("下载中 -X-> 未检测");
    }

    @Override
    public void checkNoNew() {
        System.out.println("下载中 -> 检测无新版本");
        stateContext.setDeviceState(StateContext.CHECK_NO_NEW_STATE);
    }

    @Override
    public void checkHasNew() {
        System.out.println("下载中 -> 检测有新版本");
        stateContext.setDeviceState(StateContext.CHECK_HAS_NEW_STATE);
    }

    @Override
    public void downloading() {
        // do nothing
        System.out.println("下载中");
    }

}
