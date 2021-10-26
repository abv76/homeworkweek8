package homeworkweek8;
/*
(6)Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */

public class TriangleNumber6 {

   // instance method
    void triangle(int n) {
        int i, j, num;

        for (i = 0; i < n; i++) //outer loop for rows
        {
            num = 1;
            for (j = 0; j <= i; j++) // inner loop for rows
            {
                // printing num
                System.out.print(num + "");
                num++;

            }

            //ending line with each row
            System.out.println();
        }


    }

    public static void main(String[] args) {

        TriangleNumber6 sc = new TriangleNumber6();   //calling instance with object
        sc.triangle(10);

    }


}