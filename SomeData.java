package com.company;
// importing sub classes
import static com.company.ProjectConstants.*;
public class SomeData {

    // Data or State Information

    private String userStringData;
    private int userintData;

    /*
    // Fields--------------------------------------
    private double[] datavalues = new double[MAXDATA];


     */


    // public description methods
/*
    public void Program_Description(){

        System.out.println("This Program takes your data and stores in an array to then be printed out");
    };

    // Access method(s)


 */

    public int getUserintData() {
        return userintData;
    }

    public void setUserintData(int userintData) {
        this.userintData = userintData;
    }

    public String getUserStringData() {
        return userStringData;
    }

    public void setUserStringData(String userStringData) {
        this.userStringData = userStringData;
    }

    public void display(){

    }

}
