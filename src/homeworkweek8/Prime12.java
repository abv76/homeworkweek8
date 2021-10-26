package homeworkweek8;
/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
*/

import java.util.Scanner;

public class Prime12 {


    static boolean primeNumber(int inputNumber) {
        boolean isItPrime = true;
        if (inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = sc.nextInt();
        boolean isItPrime = primeNumber(inputNumber);
        if (isItPrime) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number");
        }
        sc.close();
    }

}








