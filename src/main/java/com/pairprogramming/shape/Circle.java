package com.pairprogramming.shape;

import com.google.common.base.Preconditions;

import java.util.Objects;

/**
 * Created by binita on 04/03/15.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {

        Preconditions.checkArgument(radius>0,"Negative or zero radius not allowed");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(!(o instanceof Circle)){
            return false;
        }
        Circle circle = (Circle)o;
        return circle.radius==this.radius;

    }
    @Override
    public int hashCode(){
        return Objects.hashCode(radius);
    }
}
