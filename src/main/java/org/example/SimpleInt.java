/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args){
        int years;
        double interest, principal, Total=0, newTotal=0;
        double newInterest=0;
        System.out.println("Enter the principal");
        Scanner scanner = new Scanner(System.in);
        String newprincipal = scanner.next();
        System.out.println("Enter the rate of interest");
        Scanner scanner1 = new Scanner(System.in);
        String newinterest = scanner1.next();
        System.out.println("Enter the number of years");
        Scanner scanner2 = new Scanner(System.in);
        String newyears = scanner2.next();

        principal = Integer.parseInt(newprincipal);
        interest = Double.parseDouble(newinterest);
        years = Integer.parseInt(newyears);
        newInterest = interest/100;
        Total =  1 + (newInterest * years);
        newTotal = Total * principal;
        Math.ceil(newTotal);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + numberFormat.format(newTotal) );
    }

}
