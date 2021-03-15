package com.kuranado.state.state2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 14:01
 */
public class Client {

    public static void main(String[] args) {
        // 初使状态为未检测
        //StateContext stateContext = new StateContext(new UnCheckState());
        StateContext stateContext = new StateContext();

        // 设置初使状态
        stateContext.setDeviceState(DeviceState.UN_CHECK_STATE);

        // 过渡到检测无新版本状态
        stateContext.checkNoNew();

        // 过渡到检测有新版本状态
        stateContext.checkHasNew();

        // 过渡到未检测状态（应该过渡失败）
        stateContext.unCheck();

        // 过渡到下载中状态
        stateContext.downloading();

        // 过渡到下载失败状态
        stateContext.downloadFailed();

        // 过渡到下载中状态（应该过渡失败）
        stateContext.downloading();

        // 过渡到下载成功状态
        stateContext.downloadSuccess();

        // 过渡到升级中状态
        stateContext.upgrading();

        // 过渡到升级失败状态
        stateContext.upgradeFailed();

        // 过渡到升级成功状态
        stateContext.upgradeSuccess();

        // 过渡到升级失败状态（应该过渡失败）
        stateContext.upgradeFailed();
    }
}
