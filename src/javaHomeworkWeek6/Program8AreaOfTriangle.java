package javaHomeworkWeek6;

import java.util.Scanner;

/*
 **8. Write a program to calculate the area of a triangle.
 */
public class Program8AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextInt();
        System.out.println("Enter base of triangle::");
        double verticalHeight = scanner.nextDouble();
        System.out.println("Enter vertical height of triangle::");

        Program8AreaOfTriangle at = new Program8AreaOfTriangle();
        double area = at.calculateArea(base, verticalHeight);
        System.out.println("Area = " + area);

        scanner.close();
    }

    private double calculateArea(double base, double verticalHeight)
    {
        return base * verticalHeight / 2;
    }
}