package org.sft.casting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class B extends A{
    public void test2(){
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        //Upcasting
        A a = (A) new B();

        B b = (B)a;

        WebDriver driver = null;
        RemoteWebDriver rd = null;
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        TakesScreenshot ts = (TakesScreenshot) driver;

    }
}
