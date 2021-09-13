/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int age;
        int retireAge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age?");
        age = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        retireAge = scanner.nextInt();

        scanner.close();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d", retireAge - age, year, year + (retireAge - age));
    }
}
