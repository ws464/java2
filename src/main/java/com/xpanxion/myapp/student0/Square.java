package com.xpanxion.myapp.student0;

public final class Square extends Shape{

    //
    // Data Members
    //

    private final int size;

    //
    // Constructors
    //

    public Square(int size) {
        this.size = size;
    }

    @Override
    String draw() {
        return "Draw Square: " + this.size;
    }
}
