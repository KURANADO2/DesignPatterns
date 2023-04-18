package com.kuranado.simplefactory.simplefactory2;

import java.util.HashMap;
import java.util.Map;

/**
 * 文件操作实现类工厂 - 使用 Map 选择具体实现类
 *
 * @author Xinling Jing
 * @date 2023-04-18 10:02
 */
public class FileFactory2 {

    private static final Map<String, FileApi> MAP = new HashMap<>(3);

    private FileFactory2() {
    }

    static {
        MAP.put("S3", new S3FileApiImpl());
        MAP.put("OSS", new OssFileApiImpl());
        MAP.put("COS", new CosFileApiImpl());
    }

    public static FileApi createFileApi(String type) {
        return MAP.get(type);
    }
}
