package javaHomeworkWeek6;

import java.util.Scanner;

/*
**6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
public class Program6RadiusArea {

    public static void main(String[] args)
    {
        double radius,area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Redius value of circle::");
        radius = scanner.nextDouble();

        area = (radius*radius)*Math.PI;
        System.out.println("Area of the circle is ::"+area);

        scanner.close();
    }
}
