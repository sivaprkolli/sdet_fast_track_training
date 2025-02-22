package org.sft.abstraction;

public class ImplementData3 extends AbstractData implements InterfaceData{
    @Override
    public void register() {
        System.out.println("Test");
    }

    @Override
    public void payment() {
        System.out.println("Test");
    }

    @Override
    public void booking() {
        System.out.println("Test");
    }

}
