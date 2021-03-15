package com.kuranado.state.state2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 11:46
 */
public interface DeviceState {

    DeviceState UN_CHECK_STATE = new UnCheckState();
    DeviceState CHECK_NO_NEW_STATE = new CheckNoNewState();
    DeviceState CHECK_HAS_NEW_STATE = new CheckHasNewState();
    DeviceState DOWNLOADING_STATE = new DownloadingState();
    DeviceState DOWNLOAD_FAILED_STATE = new DownloadFailedState();
    DeviceState DOWNLOAD_SUCCESS_STATE = new DownloadSuccessState();
    DeviceState UPGRADING_STATE = new UpgradingState();
    DeviceState UPGRADE_FAILED_STATE = new UpgradeFailedState();
    DeviceState UPGRADE_SUCCESS_STATE = new UpgradeSuccessState();

    /**
     * 未检测
     *
     * @param stateContext 状态上下文
     */
    void unCheck(StateContext stateContext);

    /**
     * 未检测到新版本
     *
     * @param stateContext 状态上下文
     */
    void checkNoNew(StateContext stateContext);

    /**
     * 检测有新版本
     *
     * @param stateContext 状态上下文
     */
    void checkHasNew(StateContext stateContext);

    /**
     * 下载中
     * @param stateContext 状态上下文
     */
    void downloading(StateContext stateContext);

    /**
     * 下载失败
     * @param stateContext 状态上下文
     */
    void downloadFailed(StateContext stateContext);

    /**
     * 下载成功
     * @param stateContext 状态上下文
     */
    void downloadSuccess(StateContext stateContext);

    /**
     *  升级中
     * @param stateContext 状态上下文
     */
    void upgrading(StateContext stateContext);

    /**
     * 升级失败
     * @param stateContext 状态上下文
     */
    void upgradeFailed(StateContext stateContext);

    /**
     * 升级成功
     * @param stateContext 状态上下文
     */
    void upgradeSuccess(StateContext stateContext);
}
