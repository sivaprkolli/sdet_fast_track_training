package org.sft.programs;

public class FindMinAndMaxValueFromAnArray {

    public static void main(String[] args) {
        int[] a = {50, 64, 88, 99, 77,11};
         int maxNum = a[0];
         int minNum = a[0];

         for(int i=0; i<a.length; i++){
             if(a[i]>maxNum){
                 maxNum = a[i];
             }
         }

        for(int i=0; i<a.length; i++){
            if(a[i]<minNum){
                minNum = a[i];
            }
        }

        System.out.println("minNum :: " + minNum);
        System.out.println("maxNum :: " + maxNum);
    }
}
