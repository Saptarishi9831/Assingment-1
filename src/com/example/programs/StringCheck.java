package com.example.programs;

import java.util.*;
import java .io.*;
public class StringCheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String S = sc.nextLine();
        System.out.println("Enter another String :");
        String P = sc.nextLine();
        if( S.equals(P))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");

    }
}