package javaHomeworkWeek6;

import java.util.Scanner;

/*
**16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */
public class Program16AddTwoBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        System.out.println("Enter First Binary number::");
        String num2 = scanner.nextLine();
        System.out.println("Enter Second Binary number::");

        String sum = sum(num1, num2);
        System.out.println("Sum of two binary number::" + sum);

        scanner.close();
    }
    public static String sum(String b1, String b2)
    {
        int len1 = b1.length();
        int len2 = b2.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {
            int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }
}