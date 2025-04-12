package org.sft.Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

    @Test
    public void relativeLocatorsSamples(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement abTestLink = driver.findElement(with(By.tagName("a")).above(By.cssSelector("[href=\"/add_remove_elements/\"]")));

        abTestLink.click();
        driver.navigate().back();

        WebElement basicAuthLink = driver.findElement(with(By.tagName("a")).below(By.cssSelector("[href=\"/add_remove_elements/\"]")));
        basicAuthLink.click();
        driver.navigate().back();

        WebElement brokenImagesLink = driver.findElement(with(By.tagName("a")).near(By.cssSelector("[href=\"/add_remove_elements/\"]")));
        brokenImagesLink.click();
        driver.navigate().back();

        WebElement brokenImagesLink1 = driver.findElement(with(By.tagName("a")).toRightOf(By.cssSelector("[href=\"/add_remove_elements/\"]")));
        brokenImagesLink1.click();

    }
}
