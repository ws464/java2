package com.xpanxion.myapp.student0;

public final class Square extends Shape{

    //
    // Data Members
    //

    private int size;

    //
    // Constructors
    //

    public Square(int size) {
        this.size = size;
    }

    //
    // Accessors
    //

    //
    // Public Methods
    //

    //
    // Overrides
    //

    @Override
    String draw() {
        return "Draw Square: " + this.size;
    }

    //
    // Private Methods
    //

}
