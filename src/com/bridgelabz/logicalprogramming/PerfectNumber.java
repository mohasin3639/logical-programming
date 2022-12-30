package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int factor = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check Perfect or not ");
        num = scan.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factor += i;
            }
        }
        if (num == factor) {
            System.out.println("Number is Perfect ");
        } else
            System.out.println("Number is not perfect ");
    }
}
