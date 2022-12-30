package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length to print series ");
        int length = scan.nextInt();
        System.out.println("First " + length + " number fibonacci series is");
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < length; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }
    }
}

