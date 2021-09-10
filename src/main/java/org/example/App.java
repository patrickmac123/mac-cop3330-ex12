package org.example;
import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 12 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter the principal: " );
        String stringPrincipal = scan.nextLine();
        System.out.print( "Enter the rate of interest: " );
        String stringRate = scan.nextLine();
        System.out.print( "Enter the number of years: " );
        String stringYears = scan.nextLine();

        double principal = Double.parseDouble(stringPrincipal);
        double rate = Double.parseDouble(stringRate);
        double years = Double.parseDouble(stringYears);

        double interest = rate / 100;
        double total = principal*(1+(interest*years));

        BigDecimal formatedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("After "+stringYears+" years at "+stringRate+"%, the investment will be worth "+defaultFormat.format(formatedTotal)+".");
    }
}