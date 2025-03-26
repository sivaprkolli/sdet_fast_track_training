package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactory {

    private WebDriver driver;

    public LoginPageUsingPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(css="[name='login-button']")
    private WebElement submitButton;

    public void enterCredentials(String userName, String password) {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton() {
        submitButton.click();
    }
}
