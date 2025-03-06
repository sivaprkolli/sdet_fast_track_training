package org.sft.testNG;

import org.testng.annotations.*;

public class DataDrivenUsingXMLFIle {

    // db credentials, browser
    @Parameters({"db", "browser"})
    @BeforeSuite
    public void initializingDBReportsAndDriver(@Optional("MySQL") String dbType, @Optional("Firefox") String browserName){
        System.out.println(dbType);
        System.out.println(browserName);
    }

    // url
    @Parameters("url")
    @BeforeTest
    public void launchApplication(@Optional("chatgpt.com") String url){
        System.out.println(url);
    }

    // username, password
    @Parameters({"username", "password"})
    @Test
    public void login(@Optional("selenium") String un, @Optional("Auto@123") String pwd){
        System.out.println(un + " :: " + pwd);
    }

}
