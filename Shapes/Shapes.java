import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Rectangle= 4");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Triangle= 3");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Hexagon= 6");
    }
}

class Shapes {
    public static void main(String arg[]) {
        Shape ob1 = new Rectangle();
        Shape ob2 = new Triangle();
        Shape ob3 = new Hexagon();
        ob1.numberOfSides();
        ob2.numberOfSides();
        ob3.numberOfSides();
    }
}