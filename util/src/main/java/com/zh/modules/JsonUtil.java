package com.zh.modules;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class JsonUtil {
    private static ObjectMapper objectMapper;
    static {
        objectMapper=new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"));
    }

    /**
     * 把object转换为json
     * @param obj
     * @return
     */
    public static Object covrString2Object(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 把json转换为Object
     * @param json
     * @param clazz
     * @return
     */
    public static Object coverJson2Object(String json,Class clazz){
        try {
            return objectMapper.readValue(json,clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map coverJson2Map(String json){
        try {
            return objectMapper.readValue(json,Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
