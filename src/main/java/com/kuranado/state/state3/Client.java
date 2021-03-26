package com.kuranado.state.state3;

/**
 * @version 1.0.0
 * @author: Xinling Jing
 * @date: 2021-03-16 22:24
 */
public class Client {

    public static void main(String[] args) {
        // 初使状态为未检测
        //StateContext stateContext = new StateContext(new UnCheckState());
        StateContext stateContext = new StateContext();

        // 设置初使状态
        stateContext.setDeviceState(StateContext.UN_CHECK_STATE);

        // 过渡到检测无新版本状态
        stateContext.checkNoNew();

        // 过渡到检测有新版本状态
        stateContext.checkHasNew();

        // 过渡到未检测状态（应该过渡失败）
        stateContext.unCheck();

        // 过渡到下载中状态
        stateContext.downloading();
    }
}
