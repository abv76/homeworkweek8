package homeworkweek8;

/*
15. Display left angle triangle of * using nested for loops
  *
 * *
* * *
* * * *
 * * * * *

 */


import java.util.Scanner;

public class Program15 {
// Static method

    public static void m1() {
        //variable
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
// nested for loop
        for (i = 0; i < row; i++) {

            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print("");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter  number of rows: ");

        Program15.m1(); // calling static via class
    }

}
