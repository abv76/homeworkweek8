package homeworkweek8;
/*
(4)Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
*/


public class DigitSumChallenge4 {
// static method with one parameter
    public static int sumDigit(int number) {
// variable

        int Remainder;
        int sum = 0;

        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            Remainder = number % 10;
            sum = sum + Remainder;
            number = number / 10;

        }

        return sum;
    }
// main method

    public static void main(String[] args) {


        System.out.println(DigitSumChallenge4.sumDigit(123));
        System.out.println(DigitSumChallenge4.sumDigit(456));
        System.out.println(DigitSumChallenge4.sumDigit(234));
        System.out.println(DigitSumChallenge4.sumDigit(8));
        System.out.println(DigitSumChallenge4.sumDigit(1));
        System.out.println(DigitSumChallenge4.sumDigit(0));

    }

}

