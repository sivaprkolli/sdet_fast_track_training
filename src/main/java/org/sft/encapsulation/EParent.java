package org.sft.encapsulation;

public class EParent {

    private int a = 10;

    public int getAValue(){
        return a;
    }

    public void getAValuea(){
        System.out.println("a value :: " + a);
    }


    public static void main(String[] args) {
        EParent parent = new EParent();
        int b = parent.a;
        System.out.println(b);
    }

}
