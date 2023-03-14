package javaHomeworkWeek6;

import java.util.Scanner;

/*
**17. Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */
public class Program17ConvertDecimalNumberToBinaryNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int dec= scanner.nextInt();
        System.out.println("Input Decimal number::"+dec);

        // converting to binary and representing it in a string
        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary Number is::"+bin);

        scanner.close();
    }
}