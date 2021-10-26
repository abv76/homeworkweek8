package homeworkweek8;

/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static
*/

public class EvenDigitSum11 {
// static method

    public static int getEvenDigitSum(int number) {
        // Invalid Option
        if (number < 0) {
            return -1;
        }
        // variable
        int sum = 0;
        int lastDigit = 0;

        //calculation

        while (number > 0) {

        lastDigit = number % 10;

        // check number is even
            if (number % 2 == 0) {
                sum += lastDigit;    // adding sum+ lastDigit= sum
                number /= 10;        // number /10=number

            } else {                // check number is odd

                number /= 10;
                continue;
            }
        }
        //output
        return sum;
    }

    public static void main(String[] args) {
        int sum, sum1, sum2, sum3 = 0;
        sum = getEvenDigitSum(252);
        System.out.println("sum of even: " + sum);
        sum1 = getEvenDigitSum(123456789);
        System.out.println("sum of even: " + sum1);
        sum2 = getEvenDigitSum(-22);
        System.out.println("sum of even: " + sum2);
        sum3 = getEvenDigitSum(256);
        System.out.println("sum of even: " + sum3);

    }


}