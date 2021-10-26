package homeworkweek8;
/*
(2.) -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxinputChallenge2 {
// Instance method
    public void m1(){

// variables
        int max = 0, min = 0, num=0;
        Scanner sc= new Scanner(System.in); // input Scanner

        while (true)                      //while condition
        {
            System.out.println("Enter Number: : ");
            boolean hasNextInt= sc.hasNextInt();

            num +=1;
            if(hasNextInt){
                int number= sc.nextInt();

                boolean value= false;

                if (value){
                    min=number;
                    max=number;
                }
            if(number>max){
                max=number;

            }else if (number<min){
                min=number;
            }
            if(num==10){
                break;
            }else {

                System.out.println("Invalid number");
                break;
            }
            }

        sc.nextLine();

        }

        System.out.println("The minimum number is" +min);
        System.out.println("The maximum number is "+max);
        sc.close();
    }

    public static void main(String[] args) {
        MinAndMaxinputChallenge2 obj= new MinAndMaxinputChallenge2(); //Calling via instance method via object
        obj.m1();
    }

}