package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingTablesWithCommonFunctions extends BaseSFT{

    public CommonActions commonActions;

    @BeforeClass
    public void initialize(){
        commonActions = new CommonActions();
    }

    @Test
    public void getTableRowData(){
        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td[not(a)]"));
        commonActions.getMultipleElementsText(firstRow);
    }


    @Test
    public void getTableColumnData(){
        driver.get("https://the-internet.herokuapp.com/tables");

        /**
         * not a best practice
         */
        List<WebElement> columnData = driver.findElements(By.xpath("//span[text()='Web Site']/ancestor::table[@id=\"table1\"]/tbody/tr/td[5]"));
        for(int i=0;i< columnData.size(); i++){
             System.out.println(columnData.get(i).getText());
        }

        /**
         * Best practice
         */
        List<WebElement> columnHeaders = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        List<String> actualHeaderRowData = commonActions.getMultipleElementsText(columnHeaders);

        System.out.println(actualHeaderRowData.indexOf("Email"));
        int headerIndex = actualHeaderRowData.indexOf("Email") + 1;

        List<WebElement> emailList = driver.findElements(By.xpath("//span[text()='Web Site']/ancestor::table[@id=\"table1\"]/tbody/tr/td["+headerIndex+"]"));
        commonActions.getMultipleElementsText(emailList);
    }

    @Test
    public void getRowDataBasedOnSpecificId(){
        driver.get("https://the-internet.herokuapp.com/tables");
        String name = "Bach";
        List<WebElement> empData = driver.findElements(By.xpath("(//table[@id='table1']//td[text()='"+name+"']/following-sibling::td[not(a[@href])])"));
        /*for(int i=0;i< empData.size(); i++){
            System.out.println(empData.get(i).getText());
        }
        */
        commonActions.getMultipleElementsText(empData);

    }

}
