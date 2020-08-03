package com.lwh.jtdc.file.exception;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
public class OssApiException extends GlobalFileException {

    public OssApiException(String message) {
        super(message);
    }

    public OssApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
