package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CommonActions {

    private WebDriver driver;


    public int getProductsList(WebDriver driver, By by){
        return driver.findElements(by).size();
    }

    public int getProductsList(By by){
        return driver.findElements(by).size();
    }

    public int getProductsList(List<WebElement> element){
        return element.size();
    }

    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public void typeValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    public List<String> getMultipleElementsText(List<WebElement> elements){
        List<String> actualRowData = new ArrayList<>();
        for(int i=0;i< elements.size(); i++){
            actualRowData.add(elements.get(i).getText());
        }
        System.out.println(actualRowData);
        return actualRowData;
    }

    public List<String> getMultipleElementsText(List<WebElement> elements, String name){
        List<String> actualRowData = new ArrayList<>();
        for(int i=0;i< elements.size(); i++){
            actualRowData.add(elements.get(i).getText());
        }
        System.out.println(actualRowData);
        return actualRowData;
    }

    public boolean isElementEnabled(WebElement element){
        return element.isEnabled();
    }

    public boolean isSizeElementEnabled(WebElement element){
        return element.isDisplayed();
    }
}
