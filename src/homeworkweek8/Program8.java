package homeworkweek8;
/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
*/

import java.util.Scanner;

public class Program8 {
    // static method
    public static void m1() {
// variable
        final int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }

            System.out.println();
        }

    }

    // main method
    public static void main(String[] args) {
        Program8.m1();// calling static by class name
    }

}
