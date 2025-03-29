package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class FramesAndWindowsTest extends BaseSFT{

    @Test
    public void handleSwitchingFrames(){
        System.out.println(driver);
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        WebElement parentFrame = driver.findElement(By.cssSelector("[src$='frame_top']"));
        driver.switchTo().frame(parentFrame);
        driver.switchTo().frame("frame-left");
        //WebElement leftFrameElement = driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
        boolean b = driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).isDisplayed();
        System.out.println(b);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameElement = driver.findElement(By.xpath("//div[text()='MIDDLE']"));

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrameElement = driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']"));
    }

    @Test
    public void handleSwitchingWindows(){
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("parentWindowHandle :: " + parentWindowHandle);
        clickHereLink.click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        // Way 1
        Object[] handles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String)handles[1]);

        //way 2
       for(String window:windows){
            System.out.println(window);
            if(driver.switchTo().window(window).getTitle().equals("New Window")){
                break;
            }
        }

        WebElement newWindowsHeading = driver.findElement(By.xpath("//h3[text()='New Window']"));
    }

}
