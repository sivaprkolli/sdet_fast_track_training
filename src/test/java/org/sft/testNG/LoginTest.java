package org.sft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestVsClass{

    @Test
    public void login(){
        System.out.println("Login Test");
        Assert.assertEquals(1,2);
    }
}
