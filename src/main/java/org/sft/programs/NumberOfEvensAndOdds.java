package org.sft.programs;

public class NumberOfEvensAndOdds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;
        int printCount = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i] %2 ==0){
                evenCount ++;
            } else if (arr[i] %2 !=0){
                oddCount ++;
            }else {
                System.out.println("Invalid number: " + arr[i]);
                printCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
