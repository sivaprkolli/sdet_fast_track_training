package org.sft.inheritance;

public class CCons extends PCons{

    public CCons(){
        System.out.println("Child constructor");
    }

    public CCons(int a){

    }

    public CCons(int a, int b){

    }


    public static void main(String[] args) {
       // CCons cCons = new CCons();
        //WebDriver driver = new ChromeDriver();
        PCons cons = new CCons();
        cons.login();
        PCons pCons = new PCons();
        pCons.login();

        new CCons();

    }

    @Override
    public void login(){
        System.out.println("Child Login");
    }


}
