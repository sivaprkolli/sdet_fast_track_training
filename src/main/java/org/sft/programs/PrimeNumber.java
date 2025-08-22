package org.sft.programs;

public class PrimeNumber {

    public static void main(String[] args) {
      int num = 28;
        boolean isPrime = true;
        for (int i=2; i<=num/2; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? num + " is a prime number" : num + " is not a prime number");
    }
}
