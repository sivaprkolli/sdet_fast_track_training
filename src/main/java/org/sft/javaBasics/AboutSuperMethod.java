package org.sft.javaBasics;

public class AboutSuperMethod extends ParentTest{

    public AboutSuperMethod(){
        super(1);
        System.out.println("Test");
    }

    public static void main(String[] args) {
        AboutSuperMethod aboutSuperMethod = new AboutSuperMethod();
    }
}
