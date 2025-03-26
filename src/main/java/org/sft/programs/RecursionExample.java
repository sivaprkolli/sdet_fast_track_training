package org.sft.programs;

public class RecursionExample {
    static int a=1;
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
           a = i * a;
           //i = i * (i - 1); // 5 * 4*3*2*1
        }
        //System.out.println(a);

        int num = factorialRecursive(5);
        System.out.println(num);
    }


    public static int factorialRecursive(int n){

        if(n>0){
          int f = n*factorialRecursive(n-1);
          return f;
        } else {
            return 1;
        }
    }
}
