package com.orange.common.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Iterator;

/**
 * @program: dubbo-jzexueyun
 * @description: json转换
 * @author: chengjiaqi
 * @create: 2019/04/12 10:33
 **/
public class TransToUpperUtil {

	
	/**
     * json大写转小写
     * 
     * @param jSONArray1 jSONArray1
     * @return JSONObject
     */
    public static JSONObject transToUpperObject(String json) {
        JSONObject jSONArray2 = new JSONObject();
        JSONObject jSONArray1 = JSONObject.fromObject(json);
        Iterator it = jSONArray1.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            Object object = jSONArray1.get(key);
            if (object.getClass().toString().endsWith("JSONObject")) {
                jSONArray2.accumulate(key.toUpperCase(), transToUpperObject(object.toString()));
            } else if (object.getClass().toString().endsWith("JSONArray")) {
                jSONArray2.accumulate(key.toUpperCase(), transToArray(jSONArray1.getJSONArray(key).toString()));
            }else{
                 jSONArray2.accumulate(key.toUpperCase(), object);
            }
        }
        return jSONArray2;
    }

    /**
     * jsonArray转jsonArray
     * 
     * @param jSONArray1 jSONArray1
     * @return JSONArray
     */
    public static JSONArray transToArray(String jsonArray) {
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray1 = JSONArray.fromObject(jsonArray);
        for (int i = 0; i < jSONArray1.size(); i++) {
            Object jArray = jSONArray1.getJSONObject(i);
            if (jArray.getClass().toString().endsWith("JSONObject")) {
                jSONArray2.add(transToUpperObject( jArray.toString()));
            } else if (jArray.getClass().toString().endsWith("JSONArray")) {
                jSONArray2.add(transToArray(jArray.toString()));
            }
        }
        return jSONArray2;
    }
	
}
  