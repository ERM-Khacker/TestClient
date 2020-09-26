package com.company;

public abstract class Shape {
    private String color;
    private double area;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double area();

    public void showColorAndArea() {
        System.out.println(color + " " + area());
    }
}
