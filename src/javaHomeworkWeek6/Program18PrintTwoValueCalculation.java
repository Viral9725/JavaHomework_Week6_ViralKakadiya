package javaHomeworkWeek6;

import java.util.Scanner;

/*
**18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Program18PrintTwoValueCalculation
{
    //main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("Enter First  number::"+num1);
        double num2 = scanner.nextDouble();
        System.out.println("Enter Second number::"+num2);

        Program18PrintTwoValueCalculation obj1 = new Program18PrintTwoValueCalculation();
        obj1.addition();
        obj1.multiply();
        obj1.subtract();
        obj1.divide();
        obj1.reminder();

        scanner.close();
    }
    //addition method
    public void addition()
    {
        double num1=5;
        double num2=5;
        double ans = num1 + num2;
        System.out.println("Addition of two Number is:"+ans);
    }
    public void multiply()
    {
        double num1=5;
        double num2=5;
        double ans = num1 * num2;
        System.out.println("Multiplication of two Number is:"+ans);
    }
    public  void subtract()
    {
        double num1=5;
        double num2=5;
        double ans = num1 + num2;
        System.out.println("Subtraction of two Number is:"+ans);
    }
    public  void divide()
    {
        double num1=5;
        double num2=5;
        double ans = num1 / num2;
        System.out.println("divide of two Number is:"+ans);
    }
    public  void reminder()
    {
        double num1=5;
        double num2=5;
        double ans = num1 % num2;
        System.out.println("reminder of two Number is:"+ans);
    }
}