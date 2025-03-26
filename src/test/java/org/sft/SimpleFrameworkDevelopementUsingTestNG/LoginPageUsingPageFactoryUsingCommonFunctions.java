package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactoryUsingCommonFunctions {

    private WebDriver driver;
    private CommonActions commonActions;

    public LoginPageUsingPageFactoryUsingCommonFunctions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        commonActions = new CommonActions();
    }

    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(css="[name='login-button']")
    private WebElement submitButton;

    public void enterCredentials(String userName, String password) {
        commonActions.typeValue(userNameInput, userName);
        commonActions.typeValue(passwordInput, password);
    }

    public void clickOnLoginButton() {
        commonActions.clickOnWebElement(submitButton);
    }
}
