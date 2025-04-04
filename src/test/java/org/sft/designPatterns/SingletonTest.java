package org.sft.designPatterns;

public class SingletonTest {

    public static SingletonTest INSTANCE;

    private SingletonTest() {

    }

    public static SingletonTest getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonTest();
        }
        return INSTANCE;
    }

    public void openApplication() {
        System.out.println("Open App");
    }

}
