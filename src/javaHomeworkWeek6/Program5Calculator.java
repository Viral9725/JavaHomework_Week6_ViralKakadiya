package javaHomeworkWeek6;

import java.util.Scanner;

/*
**5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Program5Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter First  number::"+num1);
        int num2 = scanner.nextInt();
        System.out.println("Enter Second number::"+num2);

        addition(10,5);
        multiply(10,5);
        Program5Calculator obj1 = new Program5Calculator();
        obj1.subtract(2,3);
        obj1.division(10,20);

        scanner.close();
    }
    //methods all with parameters
    public static void addition(int num1, int num2)
    {
        int ans = num1 + num2;
        System.out.println("Addition of two Number is:"+ans);
    }
    public static void multiply(int num1, int num2)
    {
        int ans = num1 * num2;
        System.out.println("Multiplication of two Number is:"+ans);
    }
    public void subtract(int num1, int num2)
    {
        int ans = num1 + num2;
        System.out.println("Subtraction of two Number is:"+ans);
    }
    public  void division(int num1, int num2)
    {
        int ans = num1 / num2;
        System.out.println("division of two Number is:"+ans);
    }
}