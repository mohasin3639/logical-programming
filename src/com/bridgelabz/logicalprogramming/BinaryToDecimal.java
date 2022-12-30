package com.bridgelabz.logicalprogramming;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        int decimal = 0;
        int binary;
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary number ");
        binary = scan.nextInt();
        while (binary > 0) {
            int rem = binary % 10;
            decimal = (int) (decimal + rem * Math.pow(2, num));
            binary = binary / 10;
            num++;
        }
        System.out.println("Decimal number for given binary num is " + decimal);
    }
}
