package org.sft.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionsPart5 {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        clickOnWebElement();
        test1();
        test2();
        sleep();
        FileInputStream fileInputStream = new FileInputStream("");
    }

    public static void sleep() throws InterruptedException {

        Thread.sleep(1000);
        Thread.sleep(1000);
        throw new InterruptedException();
    }


    public static void clickOnWebElement() {
        try {
            // if element not found
            int a = 5;

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        } catch (NullPointerException ne){
            // logic to initialize object
        } catch (IndexOutOfBoundsException ie){
            // login implement index values
        }
    }

    public static void test1() {
        try {
            int a = 5 / 0;
            throw new ArithmeticException();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public static void test2() {
        try {
            int[] a = {1, 2, 3, 4, 5, 6};
            System.out.println(a[8]);
        } catch (Exception e) {

        }
    }


}
