package org.sft.APIExamples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostRequestSample {

    @Test
    public void samplePostRequest(){
        Response response = given()
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .log().all()
                .when()
                .post("https://reqres.in/api/login");

        String token = response
                .then()
                .log().all()
                .extract()
                .path("token");

        System.out.println("token :: " + token);
    }

    @Test
    public void samplePostRequest1(){
        Map<String, String> map = new HashMap<>();
        map.put("email", "eve.holt@reqres.in");
        map.put("password", "cityslicka");

        JSONObject payload = new JSONObject();
        payload.put("email", "eve.holt@reqres.in");
        payload.put("password", "cityslicka");

        System.out.println(payload);

        System.out.println(map);

        Response response = given()
                .header("x-api-key","reqres-free-v1")
                .body(payload.toString())
                .contentType(ContentType.JSON)
                .when()
                .post("https://reqres.in/api/login");
        System.out.println(response.prettyPrint());

        String token = response
                .then()
                .extract()
                .path("token");

        Assert.assertTrue(response.statusCode() == 200);

        System.out.println("token :: " + token);
    }
}
