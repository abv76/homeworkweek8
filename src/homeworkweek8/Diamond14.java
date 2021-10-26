package homeworkweek8;
/*
   14. Write a program in Java to display the pattern like a diamond.
While loop

 */

import java.util.Scanner;

public class Diamond14 {
    // Static method
    static void pattern() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter symbol: ");
        char c = sc.next().charAt(0);


        int i = 1;

        int j;
        while (i<= n)
        {
            j = 1;
            while (j++<= n-i)
            {
                System.out.print(" ");
            }
            j = 1;
            while (j++<= i * 2 - 1)
            {
                System.out.print(c);
            }
                System.out.println();
                i++;
            }
            i = n - 1;
            while (i > 0) 
            {
                j = 1;
                while(j++<=n-i)
                {
                    System.out.print(" ");
                }
                j = 1;
                while (j++ <= i * 2 - 1) 
                {

                    System.out.print(c);
                }
                System.out.println();
                i--;
            }


        }
    

    public static void main(String[] args) {
        //( not getting ans by calling scanner in main method)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int n = sc.nextInt();
//        System.out.println("Enter symbol: ");
//        char c = sc.next().charAt(0);

        Diamond14.pattern();      //static calling via class name


    }


}