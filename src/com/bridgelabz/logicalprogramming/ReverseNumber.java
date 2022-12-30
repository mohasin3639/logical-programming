package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        int rem;
        int reverse = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to print reverse ");
        num = scan.nextInt();
        System.out.println("Given number is " + num);
        while (num != 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        System.out.println("Reverse of number is " + reverse);
    }
}
