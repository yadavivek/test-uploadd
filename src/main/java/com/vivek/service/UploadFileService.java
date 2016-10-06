package com.vivek.service;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ttnd on 6/10/16.
 */
public interface UploadFileService {

    public String uploadToDrive(long userId, InputStream inputStream, String fileName, String contextPath) throws IOException;
}
