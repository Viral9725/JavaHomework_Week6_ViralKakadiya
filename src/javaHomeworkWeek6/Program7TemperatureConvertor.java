package javaHomeworkWeek6;

import java.util.Scanner;

/*
**7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7TemperatureConvertor
{
    //main Method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double Fahrenheit = scanner.nextDouble();
        System.out.println("Enter Temperature in degree Fahrenheit::"+Fahrenheit);

        calculate();

        scanner.close();
    }
    //static method declared for find Celsius
    public static void calculate()
    {
        double Fahrenheit  = 43;
        double Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Addition of two Number is:"+Celsius);
    }
}