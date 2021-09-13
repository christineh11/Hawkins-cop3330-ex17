/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r;


            System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
            int gender = input.nextInt();
            if (gender == 1) {
                r = 0.73;
            } else r = 0.66;

            System.out.println("How many ounces of alcohol did you have?");
            int ounces = input.nextInt();


            System.out.println("What is your weight, in pounds?");
            int weight = input.nextInt();

            while (!input.hasNextInt()) input.next();
            int hours = input.nextInt();


            double BAC = ounces * 5.14 / weight * r - .015 * hours;

            System.out.printf("Your BAC is: %.6f\n", BAC);

            System.out.println( BAC <= 0.08
                    ? "It is legal for you to drive."
                    : "It is not legal for you to drive.");
    }
}
