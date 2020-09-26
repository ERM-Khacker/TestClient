package com.company;

public class Main {

    public static void main(String[] args) {
//        Client client = new Client("test", "test", "test");
//        System.out.println(client);
//        Gson gson = new Gson();
        Rectangle rectangle = new Rectangle("red",4, 3);
       // System.out.println(rectangle.area());
        Square square = new Square("green",3);
       // System.out.println(square.area());
        //System.out.println(square.getColor());
        Circle circle = new Circle("Blue", 10);

        Shape[] shapes = {rectangle, square, circle};
        for (Shape shape : shapes) {
            shape.showColorAndArea();
        }

    }
}
