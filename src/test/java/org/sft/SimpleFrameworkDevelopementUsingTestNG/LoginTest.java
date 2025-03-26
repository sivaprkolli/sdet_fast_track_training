package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseSFT{

    public LoginPageUsingPageFactoryUsingCommonFunctions loginPage;


    @BeforeClass
    public void initializePages(){
        loginPage = new LoginPageUsingPageFactoryUsingCommonFunctions(driver);
    }

    @Test
    public void verifyLoginSuccess(){
        loginPage.enterCredentials("standard_user","secret_sauce");
        loginPage.clickOnLoginButton();
    }
}
