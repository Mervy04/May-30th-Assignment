/*
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
*/
    
    package com.company;
import static com.company.ProjectConstants.*;
import static com.company.SomeData.*;
import java.util.Scanner;
public class Main {

    public final static String sectionDivider = "=================================================================";

    public static void main(String[] args) {


        boolean IsValuesValid;
        String ArrayValues;


        Scanner s = new Scanner(System.in);
        SomeData someData = new SomeData();

        // creation of array of objects

        SomeData[] dataEntry = new SomeData[MAXDATA];
        int number = 0, total = 5;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        Scanner sc = new Scanner(System.in);


            do {


                System.out.println("Please enter your first integer data values ");
                number1 = someData.setUserintData(Integer.parseInt(s.next()));



                System.out.println("Please enter your second integer data values ");
                number2 = someData.setUserintData(Integer.parseInt(s.next()));

                System.out.println("Please enter your third integer data values ");
                number3 = someData.setUserintData(Integer.parseInt(s.next()));

                System.out.println("Please enter your fourth integer data values ");
                number4 = someData.setUserintData(Integer.parseInt(s.next()));

                System.out.println("Please enter your fifth integer data values ");
                number5 = someData.setUserintData(Integer.parseInt(s.next()));
            } while (number == 10);
            System.out.println("Thank you for your data " + total);
            sc.close();
        }


    public void display (){

    }





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

        /* do {
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

         */



}

    
    







