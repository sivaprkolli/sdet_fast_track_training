package org.sft.APIExamples;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequestSample {

    /**
     * given - headers/body/parameters
     * when - method & endPoint
     * then - validation
     */
    @Test
    public void verifyStatus() {
        Response response = given().
                when().
                get("https://simple-grocery-store-api.glitch.me/status");

        String value = response
                .then()
                .extract()
                .path("status").toString();

        System.out.println("value :: " + value);
    }
}
