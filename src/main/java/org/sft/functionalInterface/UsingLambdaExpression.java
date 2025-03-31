package org.sft.functionalInterface;

public class UsingLambdaExpression {

    public static void main(String[] args) {
        Automation automation = () -> {
            System.out.println("Verify all links in the page");
        };
        automation.verifyLinks();
    }
}
