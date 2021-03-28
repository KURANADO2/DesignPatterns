package com.kuranado.simplefactory.simplefactory2;

/**
 * 文件操作实现类工厂
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:33
 */
public class FileFactory {

    private FileFactory() {
    }

    /**
     * 根据外部传入的存储类型，决定创建何种对象存储文件操作实现类
     *
     * @param type 存储类型
     * @return 具体的对象存储实现类
     */
    public static FileApi createFileApi(String type) {
        switch (type.toUpperCase()) {
            case "S3":
                return new S3FileApiImpl();
            case "OSS":
                return new OssFileApiImpl();
            case "COS":
                return new CosFileApiImpl();
            default:
                return null;
        }
    }
}
