package com.kuranado.adaptor;

import java.util.List;

/**
 * @Author: Xinling Jing
 * @Date: 2018-12-23 19:48
 */
public class LogDbOperateApiImpl implements LogDbOperateApi {

    @Override
    public void createLog(LogModel logModel) {
        System.out.println("成功插入日志:" + logModel.toString() + "到数据库中");
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("成功更新数据库中日志:" + logModel.toString());
    }

    @Override
    public void removeLog(LogModel logModel) {
        System.out.println("成功删除数据库中日志:" + logModel.toString() + "到数据库中");
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("已找到数据库中的所有日志");
        return null;
    }
}
