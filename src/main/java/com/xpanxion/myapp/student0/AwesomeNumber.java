package com.xpanxion.myapp.student0;

public final class AwesomeNumber {

    //
    // Data Members
    //

    private final int myInt;

    //
    // Constructors
    //

    public AwesomeNumber(int intNumber) {
        this.myInt = intNumber;
    }

    //
    // Accessors
    //

    public int getMyInt() {
        return myInt;
    }

    //
    // Public Methods
    //

    public static String add(AwesomeNumber number1, AwesomeNumber number2) {
        return Integer.toString((number1.getMyInt() + number2.getMyInt()));
    }

    public static String subtract(AwesomeNumber number1, AwesomeNumber number2) {
        return Integer.toString((number1.getMyInt() - number2.getMyInt()));
    }

}
