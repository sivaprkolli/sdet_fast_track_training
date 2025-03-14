package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MultipleElements {
    WebDriver driver;

    @BeforeTest
    public void launchApplication(){
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void handleMultipleElements(){
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name=\"username\"]"));
        System.out.println(userNameInputBox);
        System.out.println(userNameInputBox.getText());
        System.out.println(userNameInputBox.getDomAttribute("class"));
        System.out.println(userNameInputBox.getDomAttribute("name"));

        WebElement loginFormHeading = driver.findElement(By.cssSelector("#leftPanel>h2"));
        System.out.println(loginFormHeading.getText());
        ;

        List<WebElement> menuElements = driver.findElements(By.cssSelector(".leftmenu>li"));
        System.out.println(menuElements.get(0));
        System.out.println(menuElements.get(1));

        System.out.println(menuElements.get(0).getText());
        System.out.println(menuElements.get(5).getText());
        System.out.println(menuElements);
        int size = menuElements.size();
        System.out.println(size);
        Assert.assertEquals(size, 6);

        List<String> menuItems = new ArrayList<>();
        for(int i=0;i <size; i++){
            String menu = menuElements.get(i).getText();
            menuItems.add(menu);
        }
        System.out.println(menuItems);

        SoftAssert softAssert = new SoftAssert();

        // Test Data
        List<String> expectedMenuItems = new ArrayList<>();
        expectedMenuItems.add("Solutions");
        expectedMenuItems.add("About Us");
        expectedMenuItems.add("Services");
        expectedMenuItems.add("Products");
        expectedMenuItems.add("Locations");
        expectedMenuItems.add("Admin Page");


        softAssert.assertEquals(menuItems, expectedMenuItems);
        //softAssert.assertTrue(menuElements.equals(expectedMenuItems));
        softAssert.assertAll();
    }
}
