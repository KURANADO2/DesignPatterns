package com.kuranado.simplefactory.simplefactory2;

import java.io.InputStream;

/**
 * 阿里 OSS 对象存储文件操作实现
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:26
 */
public class OssFileApiImpl implements FileApi {

    @Override
    public void uploadFile(InputStream inputStream, String objectKey) {
        System.out.println("文件已成功上传到 OSS");
    }

    @Override
    public String getUrl(String objectKey) {
        return "https://bucket.oss-cn-shanghai.aliyuncs.com/" + objectKey;
    }
}
