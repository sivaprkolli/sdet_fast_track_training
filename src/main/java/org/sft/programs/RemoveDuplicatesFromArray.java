package org.sft.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        Set<Integer> set = new HashSet<>();

        // Using a Set to remove duplicatesx
        for (int i= 0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Array without duplicates: " + set);

        // for sorting the array without duplicates
        int[] ar = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int i =0 ;

        for(int j=1; j<ar.length; j++){
            if(ar[j] != ar[i]){
                i++;
                
            }
        }
    }
}
