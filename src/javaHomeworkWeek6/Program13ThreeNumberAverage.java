package javaHomeworkWeek6;

import java.util.Scanner;

/*
** 13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class Program13ThreeNumberAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter First  number::"+num1);
        int num2 = scanner.nextInt();
        System.out.println("Enter Second number::"+num2);
        int num3 = scanner.nextInt();
        System.out.println("Enter Third number::"+num3);

        Program13ThreeNumberAverage obj1 = new Program13ThreeNumberAverage();
        obj1.avg();

        scanner.close();
    }
    public void avg()
    {
        int num1=5;
        int num2=5;
        int num3=5;
        int ans = (num1 + num2 + num3)/3;
        System.out.println("Average of Three Number Are:"+ans);
    }
}