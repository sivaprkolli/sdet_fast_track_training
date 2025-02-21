package org.sft.polymorphism;

public class PChild extends PParent{


    public static void main(String[] args) {
        PChild pChild = new PChild();
        //pChild.sum(10,10.0);
        pChild.sum(10.0,10);
        pChild.sum(10,10.0f);

        pChild.register("Siva");
    }

    @Override
    public void register(String name){
        System.out.println("Register Successful");
        System.out.println("Got vouchers");
    }


    public void register(String name, String country){

    }

    public void register(String name, int rollNumber, String location){

    }

    public void sum(int a, int b, int c){

    }

    public void sum(int a, int b){

    }

    public void sum(int a, double b){

    }


    public void sum(double a, double b){

    }

    public void sum(int a, float b){

    }

    public void sum(int a, char b){

    }

    public void sum(int a, String b){

    }


  /*  public void click(WebElement element){

    }

    public void click(AndroidElement element){

    }

    public void click(IOSElement element){

    }*/
}
