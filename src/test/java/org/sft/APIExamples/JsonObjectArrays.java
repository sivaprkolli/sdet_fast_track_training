package org.sft.APIExamples;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class JsonObjectArrays {

    @Test
    public void createJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","siva");
        jsonObject.put("id","10");

        System.out.println(jsonObject);
        System.out.println(jsonObject.get("name"));
    }

    @Test
    public void createJSONArray(){
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Test 1");
        jsonArray.add("Test 2");
        jsonArray.add("Test 3");
        System.out.println(jsonArray);
    }

    @Test
    public void addJsonArrayInJsonObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","siva");
        jsonObject.put("id","10");

        System.out.println(jsonObject);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","prasad");
        jsonObject1.put("id","15");

        System.out.println(jsonObject1);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Test 1");
        jsonArray.add("Test 2");
        jsonArray.add("Test 3");
        System.out.println(jsonArray);

        jsonObject.put("Tests", jsonArray);
        System.out.println(jsonObject.toJSONString());

        jsonObject.put("data", jsonObject1);
        System.out.println(jsonObject);
    }
}
