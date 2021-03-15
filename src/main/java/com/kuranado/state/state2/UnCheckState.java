package com.kuranado.state.state2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 14:33
 */
public class UnCheckState implements DeviceState {

    @Override
    public void unCheck(StateContext stateContext) {
        // do nothing
        System.out.println("未检测");
    }

    @Override
    public void checkNoNew(StateContext stateContext) {
        System.out.println("未检测 -> 检测无新版本");
        stateContext.setDeviceState(DeviceState.CHECK_NO_NEW_STATE);
    }

    @Override
    public void checkHasNew(StateContext stateContext) {
        System.out.println("未检测 -> 检测有新版本");
        stateContext.setDeviceState(DeviceState.CHECK_HAS_NEW_STATE);
    }

    @Override
    public void downloading(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 下载中");
    }

    @Override
    public void downloadFailed(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 下载失败");
    }

    @Override
    public void downloadSuccess(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 下载成功");
    }

    @Override
    public void upgrading(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 升级中");
    }

    @Override
    public void upgradeFailed(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 升级失败");
    }

    @Override
    public void upgradeSuccess(StateContext stateContext) {
        // do nothing
        System.out.println("未检测 -X-> 升级成功");
    }
}
