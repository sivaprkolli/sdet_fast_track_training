package org.sft.Selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenANewBrowserTab {
    @Test
    public void openNewTab(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.switchTo().newWindow((WindowType.TAB));
        driver.switchTo().newWindow(WindowType.WINDOW);
    }
}
