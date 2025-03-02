package org.sft.casting;

public class Child extends Parent{

    public static void main(String[] args) {
        //Child child = new Child();
        /*Parent parent = new Child();
        parent.test1();*/

        //Up casting
        Parent parent1 = (Parent)new Child();
        parent1.test1();

        // down casting
        Child child1 = (Child) parent1;
        child1.test1();
    }

    public void test2(){
        System.out.println("Test2");
    }
}
