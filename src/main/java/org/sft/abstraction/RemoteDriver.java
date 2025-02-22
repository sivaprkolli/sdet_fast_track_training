package org.sft.abstraction;

public class RemoteDriver implements Selenium{
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void type() {
        System.out.println("Type value");
    }

    @Override
    public String getText() {
        return null;
    }
}
