package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class CalenderTest {

    String year = "2026";
    String month = "March";
    String date = "11";
    WebDriver driver;

    @Test
    public void selectDate(){
        driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement closeButton = driver.findElement(By.cssSelector("[data-cy='closeModal']"));
        closeButton.click();

        WebElement departureDate = driver.findElement(By.cssSelector("[data-cy=\"departureDate\"]"));
        departureDate.click();

       // List<WebElement> years = driver.findElements(By.xpath("//div[contains(text(),'"+year+"')]"));
        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label='Next Month']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+year+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }

        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+month+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement depDate = driver.findElement(By.xpath("//div[contains(text(),'March')]/../../descendant::div[@class=\"DayPicker-Day\"]/div/p[text()='"+date+"'][not(normalize-space(@class)='todayPrice')]"));
        depDate.click();
    }


    public int getListOfElements(List<WebElement> elements){
        return elements.size();
    }


    public void selectCalenderDate(String[] date){
        String requiredDate = CommonActions.incrementOrDecrementDate(200);
        String[] date1 = requiredDate.split("-");

        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label='Next Month']"));
        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+date1[2]+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }

        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+date1[0]+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement depDate = driver.findElement(By.xpath("//div[contains(text(),'March')]/../../descendant::div[@class=\"DayPicker-Day\"]/div/p[text()='"+date1[1]+"'][not(normalize-space(@class)='todayPrice')]"));
        depDate.click();
    }

    public void selectCalenderDate(String year, String month, String date){
        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label='Next Month']"));
        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+year+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }

        while (true){
            if(getListOfElements(driver.findElements(By.xpath("//div[contains(text(),'"+month+"')]")))>0){
                break;
            } else {
                nextButton.click();
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement depDate = driver.findElement(By.xpath("//div[contains(text(),'March')]/../../descendant::div[@class=\"DayPicker-Day\"]/div/p[text()='"+date+"'][not(normalize-space(@class)='todayPrice')]"));
        depDate.click();
    }
}
