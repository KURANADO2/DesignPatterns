package com.kuranado.state.state4;

/**
 * 设备状态接口实现类
 *
 * @author Xinling Jing
 * @date 2021-03-27 14:15
 */
public class DeviceStateImpl implements DeviceState {

    /**
     * 设备当前状态
     */
    private int state;

    public DeviceStateImpl(int state) {
        this.state = state;
    }

    @Override
    public void unCheck() {
        switch (state) {
            case UN_CHECK_STATE:
                // do nothing
                System.out.println("未检测");
                break;
            case CHECK_NO_NEW_STATE:
                // do nothing
                System.out.println("检测无新版本 -X-> 未检测");
                break;
            case CHECK_HAS_NEW_STATE:
                // do nothing
                System.out.println("检测有新版本 -X-> 未检测");
                break;
            case DOWNLOADING_STATE:
                // do nothing
                System.out.println("下载中 -X-> 未检测");
                break;
            default:
                break;
        }
    }

    @Override
    public void checkNoNew() {
        switch (state) {
            case UN_CHECK_STATE:
                System.out.println("未检测 -> 检测无新版本");
                this.state = CHECK_NO_NEW_STATE;
                break;
            case CHECK_NO_NEW_STATE:
                // do nothing
                System.out.println("检测无新版本");
                break;
            case CHECK_HAS_NEW_STATE:
                // do nothing
                System.out.println("检测有新版本 -X-> 检测无新版本");
                break;
            case DOWNLOADING_STATE:
                System.out.println("下载中 -> 检测无新版本");
                state = CHECK_NO_NEW_STATE;
                break;
            default:
                break;
        }
    }

    @Override
    public void checkHasNew() {
        switch (state) {
            case UN_CHECK_STATE:
                System.out.println("未检测 -> 检测有新版本");
                this.state = CHECK_HAS_NEW_STATE;
                break;
            case CHECK_NO_NEW_STATE:
                System.out.println("检测无新版本 -> 检测有新版本");
                this.state = CHECK_HAS_NEW_STATE;
                break;
            case CHECK_HAS_NEW_STATE:
                // do nothing
                System.out.println("检测有新版本");
                break;
            case DOWNLOADING_STATE:
                System.out.println("下载中 -> 检测有新版本");
                state = CHECK_HAS_NEW_STATE;
                break;
            default:
                break;
        }
    }

    @Override
    public void downloading() {
        switch (state) {
            case UN_CHECK_STATE:
                // do nothing
                System.out.println("未检测 -X-> 下载中");
                break;
            case CHECK_NO_NEW_STATE:
                // do nothing
                System.out.println("检测无新版本 -X-> 下载中");
                break;
            case CHECK_HAS_NEW_STATE:
                System.out.println("检测有新版本 -> 下载中");
                state = DOWNLOADING_STATE;
                break;
            case DOWNLOADING_STATE:
                // do nothing
                System.out.println("下载中");
                break;
            default:
                break;
        }
    }
}
