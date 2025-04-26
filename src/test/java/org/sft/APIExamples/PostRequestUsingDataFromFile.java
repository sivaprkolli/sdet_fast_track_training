package org.sft.APIExamples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostRequestUsingDataFromFile {
    @Test
    public void samplePostRequest1() throws IOException, ParseException {

        FileReader file = new FileReader("./testData/login.json");
        JSONParser jsonParser = new JSONParser();
        JSONObject json = (JSONObject) jsonParser.parse(file);
        json.get("email");
        json.get("password");

        byte[] bytes = null;
        File file1 = new File(System.getProperty("user.dir")+"/testData/login.json");
        bytes = Files.readAllBytes(file1.toPath());

        System.out.println(bytes.toString());
        String data = new String(bytes);
        System.out.println(data);

        Response response = given()
                .header("x-api-key","reqres-free-v1")
                .body(data)
                .contentType(ContentType.JSON)
                .when()
                .post("https://reqres.in/api/login");

        String token = response
                .then()
                .extract()
                .path("token");

        Assert.assertTrue(response.statusCode() == 200);

        System.out.println("token :: " + token);
    }
}
