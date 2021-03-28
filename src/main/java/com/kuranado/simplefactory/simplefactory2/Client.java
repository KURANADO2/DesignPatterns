package com.kuranado.simplefactory.simplefactory2;

/**
 * 测试客户端
 *
 * @author Xinling Jing
 * @date 2021-03-28 14:34
 */
public class Client {

    public static void main(String[] args) {

        // 对象存储类型
        String type = "OSS";
        FileApi fileApi = FileFactory.createFileApi(type);

        //FileApi fileApi = null;
        //switch (type.toUpperCase()) {
        //    case "S3":
        //        fileApi = new S3FileApiImpl();
        //        break;
        //    case "OSS":
        //        fileApi = new OssFileApiImpl();
        //        break;
        //    case "COS":
        //        fileApi = new CosFileApiImpl();
        //        break;
        //    default:
        //        break;
        //}

        if (fileApi == null) {
            System.out.println("文件操作实现类创建失败");
            return;
        }

        String path = "user/avatar/1234.png";
        fileApi.uploadFile(null, path);
        String downloadUrl = fileApi.getUrl(path);
        System.out.println("文件下载 url: " + downloadUrl);
    }
}
