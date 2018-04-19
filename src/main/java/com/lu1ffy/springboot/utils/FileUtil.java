package com.lu1ffy.springboot.utils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/18 11:29
 */
public class FileUtil {

   public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
      File targetFile = new File(filePath);
      if(!targetFile.exists()){
         targetFile.mkdirs();
      }
      FileOutputStream out = new FileOutputStream(filePath+fileName);
      out.write(file);
      out.flush();
      out.close();
   }

}
