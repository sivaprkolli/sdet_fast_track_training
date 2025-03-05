package org.sft.testNG;

import org.testng.annotations.Test;

public class DependsOnTests {

    @Test
    public void test3(){
        System.out.println("Test3");
    }

    @Test(dependsOnMethods = "test3")
    public void test1(){
        System.out.println("Test1");
    }

    @Test(dependsOnMethods = "test1")
    public void test4(){
        System.out.println("Test4");
    }

    @Test(dependsOnMethods = "test3")
    public void test2(){
        System.out.println("Test2");
    }
}
