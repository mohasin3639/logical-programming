package com.bridgelabz.logicalprogramming;
import java.util.Scanner;

public class CouponCode {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int distinctnum = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many coupons you want to find");
        num = scan.nextInt();
        boolean[] coupon = new boolean[num];

        while (distinctnum < num) {
            num1 = (int) ((Math.random() * 100) % num);
            count++;
            if (coupon[num1] == false) {
                distinctnum++;
                coupon[num1] = true;
                System.out.println(num1);
            }
        }
        System.out.println("count of while loop executed is  " + count);

    }
}
