package com.bridgelabz.logicalprogramming;
import java.util.*;
public class DecimalToBinary {

    public static void toBinary() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to convert in binary ");
        num = scan.nextInt();
        String binary = "";
        int i = 0;
        int num1;
        while (num > 0) {
            num1 = num % 2;
            binary = num1 + binary;
            num = num / 2;
            i++;
        }
        System.out.println("Binary number is " + binary);
        while (binary.length() < 32) {

            binary = "0" + binary;
        }

        System.out.println("Padding of Binary number for 4 bytes(32 bit) is "
                + binary);
    }

    public static void main(String[] args) {

        DecimalToBinary.toBinary();
    }
}
