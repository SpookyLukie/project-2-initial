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

//    @Override
//    public String toString() {
//        return "Cube [surfaceArea=" + surfaceArea() + ", volume=" + volume() + "]";
//    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(surfaceArea());
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }


}
