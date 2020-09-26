package com.company;

public class Circle extends Shape {
    public double circle_radius; //Радиус окружности, измеряем в метрах

    public Circle(String color, double circle_radius) {
        super(color);
        this.circle_radius = circle_radius;
    }

    @Override
    public double area() {
        return Math.PI * circle_radius * 2;
    }
}
