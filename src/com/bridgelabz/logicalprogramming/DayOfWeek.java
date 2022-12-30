package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        int day,month,year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day ");
        day = scan.nextInt();
        System.out.println("Enter the month ");
        month = scan.nextInt();
        System.out.println("Enter the year ");
        year = scan.nextInt();
        int yn = year - (14 - month) / 12;
        int x = yn + yn / 4 - yn / 100 + yn / 400;
        int mn = month + 12 * ((14 - month) / 12) - 2;
        int dn = (day + x + (31 * mn) / 12) % 7;
        System.out.println("On " + day + "/" + month + "/" + year + " Day is");
        switch (dn) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }
}
