package com.csc205.project2;

public class Cube extends Sphere {


    public Cube(double length) {
        super(length);
    }

    public double surfaceArea() {
        return 6*radius*radius;
    }

    public double volume() {
        return radius*radius*radius;
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
