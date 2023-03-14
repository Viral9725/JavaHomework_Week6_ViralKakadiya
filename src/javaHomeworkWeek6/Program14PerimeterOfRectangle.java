package javaHomeworkWeek6;

import java.util.Scanner;

/*
**14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14PerimeterOfRectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Height of the Rectangle::");
        double l = s.nextDouble();
        System.out.println("Enter the width of the Rectangle:");
        double b = s.nextDouble();

        double  perimeter=Program14PerimeterOfRectangle.area(l,b);
        System.out.println("perimeter is:: " + perimeter);

        s.close();
    }
    public static double area(double l,double b)
    {
        double  a=2*(l+b);
        return a;
    }
}