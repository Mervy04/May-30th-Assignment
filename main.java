package com.company;
import static com.company.ProjectConstants.*;
import static com.company.SomeData.*;
import java.util.Scanner;

public class Main {

    public final static String sectionDivider = "=================================================================";

    public static void main(String[] args) {



        boolean IsValuesValid;
        String ArrayValues;


        int n;
        Scanner s = new Scanner(System.in);
        SomeData someData = new SomeData();

        // creation of array of objects

       SomeData[] dataEntry = new SomeData[MAXDATA];

        /*try {
            do {
                System.out.println("Enter the data you wish to store"); // reading the data user wishes to enter
                IsValuesValid = false;

                // stores user input in array SomeData
                if (s.hasNextDouble()) {
                    ArrayValues = s.next(String.valueOf(MAXDATA));
                }
            } while (!IsValuesValid);
        } catch (Exception e) {
            e.printStackTrace();
        }

         */

        do {
            System.out.println("Please enter the data you wis to store:");
            if (s.hasNextInt()) {
                utility.setMyInt(scan.nextInt());
                utility.setMyBoolean(true);
                utility.isMyBoolean();
            } else {
                System.out.println("Invalid integer number, please input a valid integer number next time.\t\n");
                garbage = scan.next();
                utility.setMyInt(scan.nextInt());

            }
        } // while loop
        while (utility.setMyBoolean(false));

        do {
            System.out.println("Please enter a double number:");
            if (scan.hasNextDouble()) {
                utility.setMyDouble(scan.nextDouble());
                utility.setMyBoolean(true);
                utility.isMyBoolean();
            } else {
                System.out.println("Invalid double number, please input a valid double number next time.\t\n");
                garbage = scan.next();
                utility.setMyDouble(scan.nextDouble());

            }
        }while (utility.setMyBoolean(false));

        utility.display();

    }
}







