package org.sft.serializeAndDeserialization;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ReadDataFromJson {

    public static void main(String[] args) throws IOException, ParseException {
        FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/testData/userData.json");
        JSONParser jsonParser = new JSONParser();
        JSONObject json = (JSONObject) jsonParser.parse(fileReader);

        String totalPages = json.get("total_pages").toString();
        System.out.println(totalPages);

        JSONObject supportJson = (JSONObject) json.get("support");
        String supportURL = (String) supportJson.get("url");
        System.out.println(supportURL);

        JSONArray dataArray = (JSONArray) json.get("data"); // list
        System.out.println(dataArray.get(0));
        Map map = (Map) dataArray.get(0);
        System.out.println(map.get("color"));

       /* for(int i=0; i<dataArray.size(); i++){
            System.out.println(dataArray.get(i));
        }

        for(Object a: dataArray){
            System.out.println(a);
             Iterator iterator = dataArray.iterator();
       while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        }*/

    }
}
