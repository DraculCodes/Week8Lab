/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time

    public static long getSumOfPrimes(int n){
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of primes between 1 and " + n + ": " + getSumOfPrimes(n));
    }
}

// Time complexity O(n*sqrt(n)). Space Complexity O(1)


