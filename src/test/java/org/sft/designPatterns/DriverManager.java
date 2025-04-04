package org.sft.designPatterns;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static BrowserManager getBrowserManager(String browser){
        BrowserManager browserManager = null;
        switch (browser){

            case "chrome":
                browserManager = new ChromeDriverManager();
                return browserManager;
            case "firefox":
                browserManager = new FirefoxDriverManager();
                return browserManager;
        }

        return browserManager;
    }
}
