package com.kuranado.state.state2;

/**
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-03-15 13:44
 */
public class StateContext {

    //private final DeviceState deviceState;
    private DeviceState deviceState;

    //public StateContext(DeviceState deviceState) {
    //    this.deviceState = deviceState;
    //}

    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
    }

    public void unCheck() {
        deviceState.unCheck(this);
    }

    public void checkNoNew() {
        deviceState.checkNoNew(this);
    }

    public void checkHasNew() {
        deviceState.checkHasNew(this);
    }

    public void downloading() {
        deviceState.downloading(this);
    }

    public void downloadFailed() {
        deviceState.downloadFailed(this);
    }

    public void downloadSuccess() {
        deviceState.downloadSuccess(this);
    }

    public void upgrading() {
        deviceState.upgrading(this);
    }

    public void upgradeFailed() {
        deviceState.upgradeFailed(this);
    }

    public void upgradeSuccess() {
        deviceState.upgradeSuccess(this);
    }
}
