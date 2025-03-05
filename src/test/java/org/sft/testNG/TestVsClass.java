package org.sft.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestVsClass {


    @BeforeClass
    public void sampleClass(){
        System.out.println("sampleBeforeClass");
    }

    @BeforeTest
    public void sampleBeforeTest(){
        System.out.println("sampleBeforeTest");
    }
}
