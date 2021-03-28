package com.kuranado.simplefactory.simplefactory2;

import java.io.InputStream;

/**
 * AWS S3 对象存储文件操作实现
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:31
 */
public class S3FileApiImpl implements FileApi {

    @Override
    public void uploadFile(InputStream inputStream, String objectKey) {
        System.out.println("文件已成功上传到 S3");
    }

    @Override
    public String getUrl(String objectKey) {
        return "https://bucket.s3-website.us-west-2.amazonaws.com/" + objectKey;
    }
}
