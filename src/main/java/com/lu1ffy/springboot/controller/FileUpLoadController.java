package com.lu1ffy.springboot.controller;

import com.lu1ffy.springboot.utils.FileUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/18 11:07
 */
@Controller
public class FileUpLoadController {


   @GetMapping(value = "/uploading")
   public String getUpload() {
      return "file";
   }

   @PostMapping(value = "/testuploadimg")
   public @ResponseBody
   String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
      // 获取文件的扩展名
      String contentType = file.getContentType();
      System.out.println("-------------------------------->>>>" + contentType);
      // 获取文件名
      String filename = file.getOriginalFilename();
      System.out.println("-------------------------------->>>>" + filename);
      // 获取路径
      String realPath = request.getSession().getServletContext().getRealPath("imgupload/");
      try {
         FileUtil.uploadFile(file.getBytes(), realPath, filename);
      } catch (Exception e) {
      }
      return  "uploadimg success";
   }

}
