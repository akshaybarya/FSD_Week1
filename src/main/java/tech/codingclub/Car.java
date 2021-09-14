package tech.codingclub;

public class Car {
    int maxSpeed = 300;
    int currSpeed = 0;
    static int wheels = 4;

    void accelerate(){
        currSpeed+=10;
    }

    public static void main(String[] args) {
        Car Audi = new Car();
        Car Bmw = new Car();

        System.out.println(Audi.currSpeed + " " + Bmw.currSpeed);
        System.out.println("Accelerate Audi");

        Audi.accelerate();

        System.out.println(Audi.currSpeed + " " + Bmw.currSpeed);
        System.out.println(Car.wheels + " " + Bmw.wheels);
        Audi.wheels = 8;
        System.out.println(Audi.wheels + " " + Bmw.wheels);
    }
}
