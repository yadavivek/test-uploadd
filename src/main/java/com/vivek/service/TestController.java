package com.vivek.service;

import com.vivek.dto.UploadDetail;
import com.vivek.response.StreamMediaFileResponseBean;
import org.hibernate.HibernateException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.util.Map;

/**
 * Created by ttnd on 6/10/16.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/upload")
    String handleFileUpload(@RequestParam("file") MultipartFile file) {
        String baseDir = "/home/dharam/Pictures/upload/";
        String name = "test11";
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(new File(baseDir + name + "-uploaded")));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + " into " + name
                        + "-uploaded !";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name
                    + " because the file was empty.";
        }
    }
}
