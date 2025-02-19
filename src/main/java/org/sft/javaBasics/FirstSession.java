package org.sft.javaBasics;

public class FirstSession {

    int number = 5;
    String tool = "Selenium";

    static int rollNumber = 10;
    static String name = "Siva";


    public static void main(String[] args){
        System.out.println("SDET Training");
        FirstSession firstSession = new FirstSession();
        new FirstSession();
        HelperTool helperTool = new HelperTool();

        register();
        firstSession.login();
        int a = firstSession.number; // 5
        System.out.println(firstSession.number);
        String s = firstSession.tool; // "Appium"
        System.out.println(firstSession.tool);

        System.out.println(rollNumber);
        System.out.println(name);

        helperTool.loginHelper(); // with object
        HelperTool.registerHelper(); // with class name

        int b = firstSession.sum();
        String s1 = firstSession.automationTool();
        System.out.println(b);
        System.out.println(s1);
        String c= cicdTool();
        System.out.println(c);
        System.out.println(cicdTool());

        new HelperTool().loginHelper();
        System.out.println(new FirstSession().automationTool());
    }


    static {
        String s = "Automation Training";
        System.out.println(s);
    }
    public void login(){
        System.out.println("Login successfully completed");
    }

    public static void register(){
        System.out.println("Register successfully completed");
    }

    public int sum(){
        return 15;
    }

    public String automationTool(){
        return "Playwright";
    }

    public static String cicdTool(){
        return "Azure DevOps";
    }

}
