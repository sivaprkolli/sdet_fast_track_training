package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithOutPageFactory {

    private WebDriver driver;

    public LoginPageWithOutPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameInputBox = By.id("user-name");
    private By passwordInputBox = By.id("password");
    private By loginButton = By.cssSelector("[name='login-button']");


    public void enterCredentials(String userName, String password) {
        driver.findElement(userNameInputBox).sendKeys(userName);
        driver.findElement(passwordInputBox).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }
}
