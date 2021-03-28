package com.kuranado.simplefactory.simplefactory2;

import java.io.InputStream;

/**
 * 文件操作接口
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:25
 */
public interface FileApi {

    /**
     * 上传文件
     *
     * @param inputStream 文件输入流
     * @param objectKey   文件路径
     */
    void uploadFile(InputStream inputStream, String objectKey);

    /**
     * 获取文件下载 Url
     *
     * @param objectKey 文件路径
     * @return 下载 Url
     */
    String getUrl(String objectKey);
}
