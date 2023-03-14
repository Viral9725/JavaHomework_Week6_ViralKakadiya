package javaHomeworkWeek6;

import java.util.Scanner;

/*
 **15. Write a Java program to swap two variables.
 */
public class Program15SwapTwoVariables
{
         int x,y; // x and y are to swap
         public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter the value of x::"+x);
        int y = scanner.nextInt();
        System.out.println("Enter the value of Y::"+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping the Value Result::"+x+" "+y);

        scanner.close();
    }
}