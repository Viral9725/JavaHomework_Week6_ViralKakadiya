package javaHomeworkWeek6;

import java.util.Scanner;

/*
**9. Write a program to convert the upper case to lower case.
 */
public class Program9UpperCaseToLowerCase
{
    public static void main(String[] args)
    {
        // convert to lowercase letters
        Scanner scan = new Scanner(System.in);
        String UppCase;
        System.out.println("Enter Upper case to Convert Lower case::");
        UppCase = scan.nextLine();

        String LowCase = UppCase.toLowerCase();
        System.out.println("Your Converted Line is::"+LowCase);

        scan.close();
    }
}
