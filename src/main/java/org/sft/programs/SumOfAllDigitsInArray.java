package org.sft.programs;

public class SumOfAllDigitsInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        int temp =0;

        // adding the digits of the sum
        while(sum !=0){
            temp = temp + sum%10;
            sum = sum/10;
        }
        System.out.println(temp);


    }
}
