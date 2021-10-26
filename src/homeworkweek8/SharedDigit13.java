package homeworkweek8;

/*
13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static


 */

public class SharedDigit13 {


    public static boolean hasSharedDigit(int number1, int number2) {

        //variables
        int lastDigit1;
                lastDigit1= 0;          // last digit of first number
        int lastDigit2;        // last digit of second number
        lastDigit2 = 0;
        int value = number2;       // original


        //range
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {


            while (number1 > 0) {
                lastDigit1 = number1 % 10;

                do {
                    lastDigit2 = number2 % 10;

                    if (lastDigit1 == lastDigit2) {
                        return true;
                    } else {
                        number2 /= 10;
                    }
                } while (number2 > 0);
                number2 = value;
                number1 /= 10;
            }

            }
            return false;
        }

    public static void main(String[] args) {
        boolean num= hasSharedDigit(9,99);
       System.out.println(num);
        boolean num1= hasSharedDigit(12,23);
        System.out.println(num1);
        boolean num2= hasSharedDigit(15,55);
        System.out.println(num2);


    }


}

