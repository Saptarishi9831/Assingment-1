package com.example.programs;
import java.util.*;


public class LeapYear {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0 && year % 400 == 0 | year % 100 != 0) {
                System.out.println("The year is a leap year");
            } else {
                System.out.println("The year is not a leap year");
            }
        }
    }
}
