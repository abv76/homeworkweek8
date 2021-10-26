package homeworkweek8;

/*
(5)Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
*/
public class Program5 {
    // static boolean type method with one parameter
    public static boolean isPalindrome(int number) {

        //variables

        int lastdigit = 0;    //store value of last digit
        int reverse = 0;      //store reverse number of given value
        int value = number;    //  store value given to us


        while (number != 0 || number > 0) {                  // while loop

            lastdigit = number % 10;
            reverse = reverse * 10;
            reverse += lastdigit;   /// += means reverse+lastDigit
            number /= 10;
        }
        if (value == reverse) {
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        boolean mn = isPalindrome(121);
        System.out.println(mn);
        boolean mn1 = isPalindrome(12321);      // static to static direct calling
        System.out.println(mn1);
        boolean mn2 = isPalindrome(10001);
        System.out.println(mn2);
        boolean mn3 = isPalindrome(3456);
        System.out.println(mn3);


    }
}



