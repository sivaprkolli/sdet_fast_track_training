package org.sft.javaBasics;

import org.sft.inheritance.Parent;

public class AboutSuperKeyword extends Parent {

    public static void main(String[] args) {
        AboutSuperKeyword aboutSuperKeyword = new AboutSuperKeyword();
        aboutSuperKeyword.test2();
    }

    public void test2(){
        super.login();
        super.register();
        System.out.println(super.a);
    }


}
