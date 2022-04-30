package com.xpanxion.myapp.student0;

import java.util.ArrayList;

public class Calculator implements Calculatable{

    //
    // Data Members
    //

    ArrayList<String> history;

    //
    // Constructors
    //

    Calculator() {
        this.history = new ArrayList<>();
    }

    //
    // Overrides
    //

    @Override
    public Integer add(Integer number1, Integer number2) {
        Integer retval = number1 + number2;
        history.add(number1 + " + " + number2 + " = " + retval);
        return retval;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        Integer retval = number1 - number2;
        history.add(number1 + " + " + number2 + " = " + retval);
        return retval;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        Integer retval = number1 * number2;
        history.add(number1 + " * " + number2 + " = " + retval);
        return retval;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        Integer retval = number1 / number2;
        history.add(number1 + " / " + number2 + " = " + retval);
        return retval;
    }

    @Override
    public ArrayList<String> getHistory() {
        return this.history;
    }

    //
    // Private Methods
    //

}
