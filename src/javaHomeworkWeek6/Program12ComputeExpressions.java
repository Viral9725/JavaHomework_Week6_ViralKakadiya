package javaHomeworkWeek6;

import java.util.Scanner;

/*
**12. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Program12ComputeExpressions {
    //main method declared
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Enter First  number::"+a);
        double b = scanner.nextDouble();
        System.out.println("Enter Second number::"+b);
        double c = scanner.nextDouble();
        System.out.println("Enter Third number::"+c);
        double d = scanner.nextDouble();
        System.out.println("Enter Fourth number::"+d);

        Program12ComputeExpressions obj1 = new Program12ComputeExpressions();
        obj1.avg();

        scanner.close();
    }
    public void avg()
    {
        double a=25.5;
        double b=3.5;
        double c=40.5;
        double d =4.5;
        double ans = ((a * b - b * b) / (c - d));
        System.out.println("Expected Output of Compute::"+ans);
    }
}

