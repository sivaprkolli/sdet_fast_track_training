package org.sft.Selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CDPTest {
    ChromeDriver driver;
    @Test
    public void geoLocationTest(){

        driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();

        devTools.createSession();

        Map<String, Object> location = new HashMap<>();
        location.put("latitude",19.0759);
        location.put("longitude",72.8773);
        location.put("accuracy",1);
        driver.executeCdpCommand("Emulation.setGeolocationOverride", location);

        driver.get("https://restaurants.kfc.co.in/");


    }
}
