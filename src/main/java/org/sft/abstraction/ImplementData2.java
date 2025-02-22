package org.sft.abstraction;

public class ImplementData2 implements InterfaceData{
    @Override
    public void payment() {
        System.out.println("Payment Test");
    }

    @Override
    public void booking() {
        System.out.println("Booking Test");
    }
}
