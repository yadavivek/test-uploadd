package com.vivek.dto;

/**
 * Created by ttnd on 6/10/16.
 */
public class UploadDetail {

    private String userId;
    private String type;
    private String fileName;
    private String isEsign;
    private String fileSize;


    private String senderId, receiverId, fileType, fileKey, filename;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIsEsign() {
        return isEsign;
    }

    public void setIsEsign(String isEsign) {
        this.isEsign = isEsign;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}
