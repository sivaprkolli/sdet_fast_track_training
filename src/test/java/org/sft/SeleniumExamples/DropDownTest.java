package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DropDownTest {

    WebDriver driver;

    @BeforeTest
    public void launchApplication(){
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyListValues(){

        String tool = "Selenium";
        WebElement firstNameInputBox = driver.findElement(By.cssSelector("[name='UserFirstName']"));
        WebElement lastNameInputBox = driver.findElement(By.cssSelector("[id^='UserLastName']"));
        WebElement jobTitleInputBox = driver.findElement(By.cssSelector("[name='UserTitle']"));
        WebElement nextButton = driver.findElement(By.cssSelector("[data-page-cntrl='next']"));

        firstNameInputBox.sendKeys("Siva");
        lastNameInputBox.sendKeys("Prasad");
        jobTitleInputBox.sendKeys("Architect");
        nextButton.click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("[id^='CompanyEmployees']"));
        Select selectEmployeesList = new Select(employeesDropDown);
        selectEmployeesList.selectByVisibleText("1 - 20 employees");
        selectEmployeesList.selectByIndex(4);
        selectEmployeesList.selectByValue("500");

        WebElement countryDropDown = driver.findElement(By.cssSelector("[name=\"CompanyCountry\"]"));
        Select selectCountryList = new Select(countryDropDown);
        selectCountryList.selectByVisibleText("Israel");

        WebElement selectedOption = selectCountryList.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "Israel");

        List<WebElement> countries = selectCountryList.getOptions();
        List<String> countriesList = new ArrayList<>();

        for (int i=0; i<countries.size(); i++){
            countriesList.add(countries.get(i).getText());
        }

        System.out.println(countriesList);
        Assert.assertTrue(countriesList.contains("India"));

        selectCountryList.selectByVisibleText("India");
        Assert.assertEquals(selectCountryList.getFirstSelectedOption().getText(), "India");

    }
}
