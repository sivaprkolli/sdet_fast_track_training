package org.sft.SeleniumExamples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot extends BaseSFT {

    @Test
    public void getFullScreenshot() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceImage = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationImage = new File(System.getProperty("user.dir")+"/screenshots/testImage.png");
        FileUtils.copyFile(sourceImage, destinationImage);
    }

    @Test
    public void getElementScreenshot() throws IOException {
        WebElement image = driver.findElement(By.cssSelector("[alt=\"Fork me on GitHub\"]"));
        File sourceImage = image.getScreenshotAs(OutputType.FILE);
        File destinationImage = new File(System.getProperty("user.dir")+"/screenshots/element.png");
        FileUtils.copyFile(sourceImage, destinationImage);
    }
}
