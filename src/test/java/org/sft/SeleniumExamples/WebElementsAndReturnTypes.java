package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebElementsAndReturnTypes {
WebDriver driver;

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        //sum(5,5);
        int a = sum(5,5,5);
        System.out.println(a);
    }

    @BeforeTest
    public void launchApp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void verifySuccessfulLogin(){

        /*userNameInputBox().sendKeys("standard_user");
        passwordInputBox().sendKeys("secret_sauce");
        loginButton().click();*/

        typeValue(userNameInputBox(), "standard_user");
        typeValue(passwordInputBox(),"secret_sauce");
        clickOnWebElement(loginButton());
        Assert.assertEquals(getProductsHeading(), "Products");
        Assert.assertTrue(isProductsHeadingDisplayed());
        System.out.println(getProductsList());
        System.out.println(getProductsList().size());
        List<String> titles = new ArrayList<>();

        for (WebElement product:getProductsList()){
            titles.add(product.getText());
        }

        System.out.println(titles);
    }

    public List<WebElement> getProductsList(){
        return driver.findElements(By.cssSelector(".inventory_item"));
    }

    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public void typeValue(WebElement element, String data){
        element.sendKeys(data);
    }


    public String getProductsHeading(){
        return driver.findElement(By.cssSelector(".title")).getText();
    }

    public boolean isProductsHeadingDisplayed(){
        return driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
    }

    public WebElement userNameInputBox(){
        return driver.findElement(By.id("user-name"));
    }

    public WebElement passwordInputBox(){
        return driver.findElement(By.id("password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.cssSelector(".submit-button.btn_action"));
    }
}
