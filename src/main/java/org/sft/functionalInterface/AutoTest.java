package org.sft.functionalInterface;

public class AutoTest {

    public static void main(String[] args) {
        Automation automation = new Automation() {
            public void verifyLinks() {
                System.out.println("Verify all links in the page");
            }
        };

        automation.verifyLinks();
    }
}
