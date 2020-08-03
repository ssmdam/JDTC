package com.lwh.jtdc.file;

import com.lwh.jtdc.file.entity.VirtualFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;

/**
 * @since 1.8
 */
public interface ApiClient {

    VirtualFile uploadImg(MultipartFile file);

    VirtualFile uploadImg(File file);

    VirtualFile uploadImg(InputStream is, String key);

    boolean removeFile(String key);
}
