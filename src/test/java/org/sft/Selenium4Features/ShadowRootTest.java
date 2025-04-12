package org.sft.Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowRootTest {

    @Test
    public void handleShadowRoot(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/");

        WebElement mainShadowrootElement = driver.findElement(By.cssSelector("[origin*='sfdcdigital'][locale]"));
        SearchContext searchContextElement = mainShadowrootElement.getShadowRoot();
        searchContextElement.findElement(By.cssSelector("[data-tracking-type=\"cta-utility\"]")).click();
    }
}
