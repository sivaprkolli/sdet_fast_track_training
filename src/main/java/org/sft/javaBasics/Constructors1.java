package org.sft.javaBasics;

public class Constructors1 {
    int a , b , c;

    public Constructors1() {
        System.out.println("Test Automation");
        int a = 10, b = 10;
        System.out.println(a+b);
    }

    public Constructors1(int a, int b) {
//        Constructors1 constructors1 = new Constructors1();
//        constructors1.a = a;
//        constructors1.b = b;
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Constructors1 constructors1 = new Constructors1();
        Constructors1 constructors2 = new Constructors1();
        Constructors1 constructors3 = new Constructors1(10, 20);
        Constructors1 constructors11 ;
        constructors11 = new Constructors1(10, 20);

        System.out.println("a value :: "+ constructors3.a);
        System.out.println("b value :: " + constructors3.b);
    }

    public void sum() {
        System.out.println("Sum");
    }

    public void total(int a, int b) {
        System.out.println(a + b);
    }
}
