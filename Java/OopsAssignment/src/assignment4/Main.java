package assignment4;

import java.util.Scanner;

abstract class shape {
    double val1, val2;

    abstract void compute_area();
}

class Triangle extends shape {
    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values for Triangle::");
        System.out.println("Enter first value::");
        val1 = s.nextDouble();
        System.out.println("Enter second value::");
        val2 = s.nextDouble();
    }

    void compute_area() {

        double area;
        area = 1.0f / 2.0f * val1 * val2;
        System.out.println("Area of triangle is::" + area);

    }
}

class Rectangle extends shape {
    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values for rectangle::");
        System.out.println("Enter first value::");
        val1 = s.nextDouble();
        System.out.println("Enter second value::");
        val2 = s.nextDouble();
    }

    void compute_area() {

        double area;
        area = val1 * val2;
        System.out.println("Area of rectangle is::" + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.input();
        t.compute_area();
        r.input();
        r.compute_area();
    }
}


