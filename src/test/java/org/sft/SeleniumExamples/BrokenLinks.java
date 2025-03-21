package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks extends BaseSFT{

    @Test
    public void getBrokenLinks() throws IOException {
        List<WebElement> links = driver.findElements(By.tagName("a"));

        List<String> actualUrls = new ArrayList<>();
        for(int i=1; i< links.size(); i++){

            actualUrls.add("https://the-internet.herokuapp.com" +links.get(i).getDomAttribute("href"));
        }
        System.out.println(actualUrls);

        URL url = new URL(actualUrls.get(1));
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.connect();

        if(httpURLConnection.getResponseCode() == 200){
            System.out.println(actualUrls.get(1));
            System.out.println(httpURLConnection.getResponseMessage());
        }
    }
}
