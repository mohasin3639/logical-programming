package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        int temp = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Number is prime ");
        } else
            System.out.println("Number is not prime ");
    }
}
