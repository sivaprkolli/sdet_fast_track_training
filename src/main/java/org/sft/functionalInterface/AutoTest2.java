package org.sft.functionalInterface;

public class AutoTest2 {
    public static void main(String[] args) {
        AutomationA1 automationA1 = (a, b)-> (a+b);
        automationA1.sum(10,10);
    }
}
