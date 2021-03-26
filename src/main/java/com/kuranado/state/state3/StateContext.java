package com.kuranado.state.state3;

/**
 * @version 1.0.0
 * @author: Xinling Jing
 * @date: 2021-03-16 22:26
 */
public class StateContext {

    public final static DeviceState UN_CHECK_STATE = new UnCheckState();
    public final static DeviceState CHECK_NO_NEW_STATE = new CheckNoNewState();
    public final static DeviceState CHECK_HAS_NEW_STATE = new CheckHasNewState();
    public final static DeviceState DOWNLOADING_STATE = new DownloadingState();

    private DeviceState deviceState;

    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
        this.deviceState.setStateContext(this);
    }

    public void unCheck() {
        deviceState.unCheck();
    }

    public void checkNoNew() {
        deviceState.checkNoNew();
    }

    public void checkHasNew() {
        deviceState.checkHasNew();
    }

    public void downloading() {
        deviceState.downloading();
    }
}
