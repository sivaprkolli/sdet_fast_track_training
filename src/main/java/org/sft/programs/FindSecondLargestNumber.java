package org.sft.programs;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num :arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num> secondLargest && num< largest){
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
