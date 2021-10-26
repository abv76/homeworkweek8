package homeworkweek8;
/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */


import java.util.Scanner;

public class Program9 {
    // instance method with one parameter
    void myMethod(int count) {
        // variable
        int num1 = 0, num2 = 1;

        int i = 1;
        while (i <= count) {

            System.out.print(num1 + " ");
            int sumofPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumofPrevTwo;
            i++;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci series of " + " numbers:");
        System.out.println("How many numbers you want");
        int count = sc.nextInt();
        sc.close();

        Program9 obj = new Program9();
        obj.myMethod(8);

    }

}
