package com.kuranado.state.state3;

/**
 * @version 1.0.0
 * @author: Xinling Jing
 * @date: 2021-03-16 22:26
 */
public class CheckHasNewState extends DeviceState {

    @Override
    public void unCheck() {
        // do nothing
        System.out.println("检测有新版本 -X-> 未检测");
    }

    @Override
    public void checkNoNew() {
        System.out.println("检测有新版本 -X-> 检测无新版本");
        stateContext.setDeviceState(StateContext.CHECK_NO_NEW_STATE);
    }

    @Override
    public void checkHasNew() {
        // do nothing
        System.out.println("检测有新版本");
    }

    @Override
    public void downloading() {
        System.out.println("检测有新版本 -> 下载中");
        stateContext.setDeviceState(StateContext.DOWNLOADING_STATE);
    }
}
