/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter weight fatty: ");
        double weight = scnr.nextDouble();

        System.out.println("Please enter your height shorty: ");
        double height = scnr.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        if (bmi >= 18.5 && bmi <= 25)
        {
           System.out.format("Your BMI is %.1f\nYou are within the ideal weight range", bmi);

        }
        else if(bmi > 25)
        {
            System.out.format("Your BMI is %.1f\nYou are overweight. You should see your doctor", bmi);
        }
        else
        {
            System.out.format("Your BMI is %.1f\nYou are underweight. You should see your doctor", bmi);
        }
    }
}
