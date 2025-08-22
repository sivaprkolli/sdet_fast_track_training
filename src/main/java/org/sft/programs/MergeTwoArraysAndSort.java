package org.sft.programs;

public class MergeTwoArraysAndSort {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i=0; i<arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        for (int i=0; i<arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        for (int i=0; i<mergedArray.length; i++){


            for (int j=i+1; j<mergedArray.length; j++){
                if (mergedArray[i] < mergedArray[j]){
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
            System.out.println(mergedArray[i]);
        }
    }
}
