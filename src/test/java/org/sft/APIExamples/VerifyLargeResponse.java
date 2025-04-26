package org.sft.APIExamples;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import static io.restassured.RestAssured.given;

public class VerifyLargeResponse {

    @Test
    public void verifyLargeResponse() throws IOException {
        Response response =
                given()
                        .header("x-api-key", "reqres-free-v1")
                        .when()
                        .get("https://reqres.in/api/users?page=1");

        System.out.println(response.asPrettyString());

        byte[] bytes = Files.readAllBytes(
                new File(System.getProperty("user.dir") + "/testData/userData.json").toPath());
        String data = new String(bytes);
        //System.out.println(data);

        //Assert.assertEquals(response.asPrettyString(), data);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.asByteArray());

        System.out.println(jsonNode.toPrettyString());

        Assert.assertEquals(jsonNode.toPrettyString(), data);
    }
}
