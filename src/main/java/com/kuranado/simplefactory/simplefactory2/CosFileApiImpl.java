package com.kuranado.simplefactory.simplefactory2;

import java.io.InputStream;

/**
 * 腾讯云 COS 对象存储文件操作实现
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:32
 */
public class CosFileApiImpl implements FileApi {

    @Override
    public void uploadFile(InputStream inputStream, String objectKey) {
        System.out.println("文件已成功上传到 COS");
    }

    @Override
    public String getUrl(String objectKey) {
        return "https://bucket.cos.ap-shanghai.myqcloud.com/" + objectKey;
    }
}
