package com.lu1ffy.springboot.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO Add class description here
 *
 * @author Luffy
 * @create 2018/4/16 9:29
 */
public class Json {

   public static void main(String[] args) {
      /*Map<String, Object> map = new HashMap<>();
      map.put("key1", "value");
      map.put("key2", "value");
      // Map转为Json
      String str = JSON.toJSONString(map);
      System.out.println(str);*/

      List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
      Map<String, Object> map = new HashMap<>();
      map.put("key1", "value1");
      map.put("key2", "value2");

      Map<String, Object> map1 = new HashMap<>();
      map1.put("key1", "value3");
      map1.put("key2", "value4");

      list.add(map);
      list.add(map1);

      String s = JSON.toJSONString(list);
      System.out.println(s);
      String dataJson = JSON.toJSONString(new Date(), SerializerFeature.WriteDateUseDateFormat);
      System.out.println(dataJson);

   }

}
