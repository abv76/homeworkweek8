package homeworkweek8;
/*

7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
*/

public class Program7 {
    // Instance method

    private int sumFirstAndLastDigit(int number) {

        if (number < 0) {                              // if condition
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;
        for (int i = number; i != 0; i /= 10) {                   // For loop for conditional statement
            lastDigit = i % 10;
        }
        return firstDigit + lastDigit;

    }

    public static void main(String[] args) {

        Program7 sc = new Program7();
        sc.sumFirstAndLastDigit(252);


        System.out.println(sc.sumFirstAndLastDigit(0));
        System.out.println(sc.sumFirstAndLastDigit(5));
        System.out.println(sc.sumFirstAndLastDigit(-10));
        System.out.println(sc.sumFirstAndLastDigit(251));
        System.out.println(sc.sumFirstAndLastDigit(257));
        System.out.println(sc.sumFirstAndLastDigit(252));

    }
}
