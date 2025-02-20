package org.sft.javaBasics;


// Hello Java

/*
{
Testing
}
*/

/**
 * About object
 */
public class AboutObject {
    int a;
    String s;
    HelperTool helperTool;
    static AboutObject aboutObject2;

    public static void main(String[] args) {
        AboutObject aboutObject = new AboutObject();
        AboutObject aboutObject1 = new AboutObject();
        AboutObject aboutObject3 = null;
        System.out.println(aboutObject3);


        aboutObject2 = new AboutObject();

        System.out.println(aboutObject.a);
        System.out.println(aboutObject.s);
        System.out.println(aboutObject);
        System.out.println(aboutObject.hashCode());
        System.out.println(aboutObject1.hashCode());
        System.out.println(new HelperTool().hashCode());
        System.out.println(aboutObject.helperTool);

        aboutObject.loginTest();

    }

    public int loginTest(){
        int d = 0;
        System.out.println(d);
        return d;
    }
}
