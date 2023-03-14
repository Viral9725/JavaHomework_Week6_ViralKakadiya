package javaHomeworkWeek6;

import java.util.Scanner;

/*
**10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class Program10MultiplicationTable {
    //declare variable
    static int z = 1;

    //main Method Declare
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Which table Do you want?::");
        int y = scanner.nextInt();
        int c = y*z;
        int d = y * (z + 1), e = y * (z + 2), f = y * (z + 3), g = y * (z + 4), h = y * (z + 5), i = y * (z + 6), j = y * (z + 7), k = y * (z + 8), l = y * (z + 9), m = y * (z + 10);
        System.out.println(y + "*1" + "=" + c);
        System.out.println(y + "*2" + "=" + d);
        System.out.println(y + "*3" + "=" + e);
        System.out.println(y + "*4" + "=" + f);
        System.out.println(y + "*5" + "=" + g);
        System.out.println(y + "*6" + "=" + h);
        System.out.println(y + "*7" + "=" + i);
        System.out.println(y + "*8" + "=" + j);
        System.out.println(y + "*9" + "=" + k);
        System.out.println(y + "*10" + "=" + l);

        scanner.close();
    }
}
