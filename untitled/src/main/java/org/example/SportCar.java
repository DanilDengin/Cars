package org.example;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String brand, String carClass, int weigh, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weigh, driver, engine);
        this.maxSpeed=maxSpeed;
    }
}
