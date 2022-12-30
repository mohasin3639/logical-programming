package com.bridgelabz.logicalprogramming;
import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to convert in binary ");
        num = scan.nextInt();
        String binary = "";
        String binarySwap = "";
        int i = 0;
        int num1;
        while (num > 0) {
            num1 = num % 2;
            binary = num1 + binary;
            num = num / 2;
            i++;
        }
        System.out.println(binary);
        while (binary.length() < 8) {

            binary = "0" + binary;
        }
        System.out.println("Padding of Binary is " + binary);
        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, binary.length());

        binarySwap = nibble2 + nibble1;
        System.out
                .println("After swapping nibbles new number is " + binarySwap);
        int result = Integer.parseInt(binarySwap);
        int decimal = 0;
        int pow = 0;

        while (result > 0) {
            int rem = result % 10;
            decimal = (int) (decimal + rem * Math.pow(2, pow));
            result = result / 10;
            pow++;
        }
        System.out.println("Decimal number for " + binarySwap + " is " + decimal);

    }
}
