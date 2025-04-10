package org.sft.factoryDesignPattern;

public class WebDriverFactory {

    public static SeleniumDriverManager launchBrowser(String browser){
        switch (browser){
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FirefoxDriverManager();
            default:
                throw new IllegalArgumentException("Please provide right browser name !!");
        }
    }
}
