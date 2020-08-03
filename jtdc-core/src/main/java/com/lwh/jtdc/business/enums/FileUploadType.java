package com.lwh.jtdc.business.enums;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
public enum FileUploadType {
    COMMON("oneblog/"),
    QRCODE("oneblog/qrcode/"),
    SIMPLE("oneblog/article/"),
    COVER_IMAGE("oneblog/cover/");

    private String path;

    FileUploadType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
