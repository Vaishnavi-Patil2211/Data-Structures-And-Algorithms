package assignment5;

interface Vehical {
    void gearChange();

    void speedUp();

    void applyBrakes();
}


class Bicycle implements Vehical {
    public void gearChange() {
        System.out.println("Gear change for bicycle");
    }

    public void speedUp() {
        System.out.println("Speed up for bicycle");
    }

    public void applyBrakes() {
        System.out.println("Apply brakes for bicycle");
    }

}

class Bike implements Vehical {
    public void gearChange() {
        System.out.println("Gear change for bike");
    }

    public void speedUp() {
        System.out.println("Speed up for bike");
    }

    public void applyBrakes() {
        System.out.println("Apply brakes for bike");
    }

}


class Car implements Vehical {
    public void gearChange() {
        System.out.println("Gear change for car");
    }

    public void speedUp() {
        System.out.println("Speed up for car");
    }

    public void applyBrakes() {
        System.out.println("Apply brakes for car");
    }

}

public class Main {
    public static void main(String[] args) {

        Vehical v1 = new Bicycle();
        v1.gearChange();
        v1.speedUp();
        v1.applyBrakes();


        Vehical v2 = new Bike();
        v2.gearChange();
        v2.speedUp();
        v2.applyBrakes();

        Vehical v = new Car();
        v.gearChange();
        v.speedUp();
        v.applyBrakes();
    }
}