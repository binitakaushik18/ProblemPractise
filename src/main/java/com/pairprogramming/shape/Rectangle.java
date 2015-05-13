package com.pairprogramming.shape;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/**
 * Created by binita on 04/03/15.
 */
public class Rectangle implements  Shape {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        Preconditions.checkArgument(length>0, "Zero length not allowed");
        Preconditions.checkArgument(width>0, "Zero width not allowed");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length+length+width+width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;

        return this.getLength() == rectangle.getLength() && this.getWidth() == rectangle.getWidth();

    }

    @Override
    public int hashCode(){
        return Objects.hashCode(length,width);
    }


}
