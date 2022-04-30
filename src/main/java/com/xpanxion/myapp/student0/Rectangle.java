package com.xpanxion.myapp.student0;

import org.w3c.dom.css.Rect;

public final class Rectangle extends Shape {

    //
    // Data Members
    //

    private final int width;
    private final int height;

    //
    // Constructors
    //

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String draw() {
        return "Rectangle: " + this.width + " " + this.height;
    }
}
