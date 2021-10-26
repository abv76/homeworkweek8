package homeworkweek8;
/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153

 */

import java.util.Scanner;

public class Armstrong10 {
// Instance method
    static void m1() {

        int num,number,rem,total=0;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number=num;
        

        while (number != 0)
        {

            rem = number % 10;
            total = total + (rem * rem * rem);
            number/=10;
        }

        if (total == num)
            System.out.println( num + " Armstrong Number");
         else
            System.out.println(num+ " Not an Armstrong number");

    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number ");
//        int number = sc.nextInt();
//        sc.close();
        Armstrong10.m1();




    }


}
