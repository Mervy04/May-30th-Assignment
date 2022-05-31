package com.company;

public final class ProjectConstants {

    // ---------*---------*---------*---------*---------*
    // String Constants
    public static final String SECTION_DIV = "\n=================================================================================";
    public static final String DATA_DIV = "\n=========================================";

    // Data
    public static final String TYPE_ERR = "\n\tERROR DATA TYPE MISMATCH: ";
    public static final String EXPECTED_INT = "Integer data expected.";
    public static final String EXPECTED_DBL = "Double precision data expected.";
    public static final String EXPECTED_BOOL = "Boolean data expected.";

    // ---------*---------*---------*---------*---------*
    // Integer Constants

    public static final int INVALID = -1;
    public static final int MAXDATA = 5;
    public static final int DATALOW = 0;
    public static final int DATAHIGH = 10;




    // ---------*---------*---------*---------*---------*
    // Boolean Constants

    public static final boolean DBG = false;

    // PRIVATE //

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The caller references the constants using ProjectConstants.MAXDATA, or as MAXDATA.
    // We prevent the caller should be prevented from constructing objects of
    // this class, by declaring this private constructor.
    //
    protected ProjectConstants() {
        //this prevents even the native class from calling this constructor as well
        throw new AssertionError();
    }


}
