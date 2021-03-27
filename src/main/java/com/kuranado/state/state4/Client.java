package com.kuranado.state.state4;

/**
 * 非状态模式下的状态扭转
 *
 * @author Xinling Jing
 * @date 2021-03-27 14:08
 */
public class Client {

    public static void main(String[] args) {

        // 设置初使状态为未检测
        DeviceState deviceState = new DeviceStateImpl(DeviceState.UN_CHECK_STATE);

        // 设备开始上报自身状态
        // 过渡到检测无新版本状态
        deviceState.checkNoNew();

        // 过渡到检测有新版本状态
        deviceState.checkHasNew();

        // 过渡到未检测状态（应该过渡失败）
        deviceState.unCheck();

        // 过渡到下载中状态
        deviceState.downloading();
    }
}
