package org.sft.designPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWebDriver {

    public static CreateWebDriver INSTANCE;
    private WebDriver driver;
    private static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

    private CreateWebDriver() {

    }

    public static CreateWebDriver getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CreateWebDriver();
        }
        return INSTANCE;
    }

    public void setDriver(){
        driver = new ChromeDriver();
        tDriver.set(driver);
    }

    public WebDriver getDriver(){
        return tDriver.get();
    }

}
