/*
package com.vivek.service.serviceImpl;

import com.vivek.service.UploadFileService;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.*;

*/
/**
 * Created by ttnd on 6/10/16.
 *//*

@Service
public class UploadFileServiceImpl implements UploadFileService {

    */
/**
     * **********************************************************************************************************
     * The method uploadToDrive upload file in user directory and create thumb
     * nail for image and video.
     *
     * @param userId
     * @param inputStream
     * @param fileName
     * @param contextPath
     * @return
     * @throws IOException ***********************************************************************************************************
     *//*

    public String uploadToDrive(long userId, InputStream inputStream,
                                String fileName, String contextPath) throws IOException {

        UserSignUpInfoDao signUpInfoDao = null;
        String filePath = "";
        UserSignUpInfoEntity userEntity;
        String completeFilepath = "";
        OutputStream fos = null;

        try {

            signUpInfoDao = new UserSignUpInfoDaoImpl();

            // Getting file type by file extension

            int fileType = MEFileUtil.getFileTypeByURL(fileName);

            userEntity = signUpInfoDao.getUserInfo(userId);

            if (userEntity == null) {
                return filePath;
            }

            String folderName = "";
            String fileExt = "";
            String thumbUrl = "";

            long saveTimeStamp = System.currentTimeMillis();

            try {

                fileName = fileName.replace(" ", "_");
                int dotIndex = fileName.lastIndexOf(".");
                fileExt = fileName.substring(dotIndex, fileName.length());
                fileName = fileName.substring(0, dotIndex) + "_"
                        + saveTimeStamp + fileExt;

            } catch (Exception e) {
                log.error("Error ", e);
            }

			*/
/* Getting file path for media or document *//*


            if (fileType == MEConstants.MESSAGE_TYPE_IMAGE) {
                folderName = MEFileUtil.getMyCloudFilePathImage(userId,
                        userEntity.getEmailId());
            } else if (fileType == MEConstants.MESSAGE_TYPE_VIDEO) {
                folderName = MEFileUtil.getMyCloudFilePathVideo(userId,
                        userEntity.getEmailId());
            } else if (fileType == MEConstants.MESSAGE_TYPE_AUDIO) {
                folderName = MEFileUtil.getMyCloudFilePathAudio(userId,
                        userEntity.getEmailId());
            } else { // file path for document

                folderName = MEFileUtil.getMyCloudFilePathDocuments(userId,
                        userEntity.getEmailId());
            }

			*/
/* Location to save Received File data *//*


            filePath = folderName + fileName;

            new File(contextPath + folderName).mkdirs();

			*/
/* Writing out put file *//*


            completeFilepath = contextPath + filePath;

            File file = new File(completeFilepath);

            fos = new FileOutputStream(file);

			*/
/* Copying file *//*


            IOUtils.copy(inputStream, fos);

            fos.flush();

			*/
/* Creating thumb nail image *//*


            if (fileType == MEConstants.MESSAGE_TYPE_IMAGE) {

                MEFileUtil uploadUtil = new MEFileUtil();

                thumbUrl = MEFileUtil.createThumbUrl(filePath, fileType);

                uploadUtil.createThumbnail(completeFilepath, contextPath
                        + thumbUrl, MEConstants.THUMB_EXT);

            } else if (fileType == MEConstants.MESSAGE_TYPE_VIDEO) {

                thumbUrl = MEFileUtil.createThumbUrl(filePath, fileType);

                MEMediaUtil.grabVideoFrame(completeFilepath, contextPath
                        + thumbUrl);
            }

        } catch (Exception e) {
            log.error("Error ", e);

            // delete file if uploaded some part

            new File(completeFilepath).delete();
            filePath = null;

        } finally {

            if (fos != null) {
                fos.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return filePath;
    }

}
*/
