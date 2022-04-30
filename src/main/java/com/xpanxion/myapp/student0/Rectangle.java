package com.xpanxion.myapp.student0;

import org.w3c.dom.css.Rect;

public final class Rectangle extends Shape {

    //
    // Data Members
    //

    private int width;
    private int height;

    //
    // Constructors
    //

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
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
        return "Rectangle: " + this.width + " " + this.height;
    }

    //
    // Private Methods
    //
}
