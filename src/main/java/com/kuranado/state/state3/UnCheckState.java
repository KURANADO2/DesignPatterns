package com.kuranado.state.state3;

/**
 * @version 1.0.0
 * @author: Xinling Jing
 * @date: 2021-03-16 22:26
 */
public class UnCheckState extends DeviceState {

    @Override
    public void unCheck() {
        // do nothing
        System.out.println("未检测");
    }

    @Override
    public void checkNoNew() {
        System.out.println("未检测 -> 检测无新版本");
        super.stateContext.setDeviceState(StateContext.UN_CHECK_STATE);
    }

    @Override
    public void checkHasNew() {
        System.out.println("未检测 -> 检测有新版本");
        stateContext.setDeviceState(StateContext.CHECK_HAS_NEW_STATE);
    }

    @Override
    public void downloading() {
        // do nothing
        System.out.println("未检测 -X-> 下载中");
    }
}
