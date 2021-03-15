package com.kuranado.state.state2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 16:02
 */
public class DownloadingState implements DeviceState {

    @Override
    public void unCheck(StateContext stateContext) {
        // do nothing
        System.out.println("下载中 -X-> 未检测");
    }

    @Override
    public void checkNoNew(StateContext stateContext) {
        System.out.println("下载中 -> 检测无新版本");
        stateContext.setDeviceState(DeviceState.CHECK_NO_NEW_STATE);
    }

    @Override
    public void checkHasNew(StateContext stateContext) {
        System.out.println("下载中 -> 检测有新版本");
        stateContext.setDeviceState(DeviceState.CHECK_HAS_NEW_STATE);
    }

    @Override
    public void downloading(StateContext stateContext) {
        // do nothing
        System.out.println("下载中");
    }

    @Override
    public void downloadFailed(StateContext stateContext) {
        System.out.println("下载中 -> 下载失败");
        stateContext.setDeviceState(DeviceState.DOWNLOAD_FAILED_STATE);
    }

    @Override
    public void downloadSuccess(StateContext stateContext) {
        System.out.println("下载中 -> 下载成功");
        stateContext.setDeviceState(DeviceState.DOWNLOAD_SUCCESS_STATE);
    }

    @Override
    public void upgrading(StateContext stateContext) {
        System.out.println("下载中 -> 升级中");
        stateContext.setDeviceState(DeviceState.UPGRADING_STATE);
    }

    @Override
    public void upgradeFailed(StateContext stateContext) {
        System.out.println("下载中 -> 升级失败");
        stateContext.setDeviceState(DeviceState.UPGRADE_FAILED_STATE);
    }

    @Override
    public void upgradeSuccess(StateContext stateContext) {
        System.out.println("下载中 -> 升级成功");
        stateContext.setDeviceState(DeviceState.UPGRADE_SUCCESS_STATE);
    }
}
