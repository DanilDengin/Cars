package org.example;

public class Lorry extends Car{
    private int capasityBody;


    public Lorry(String brand, String carClass, int weigh, Driver driver, Engine engine, int capasityBody) {
        super(brand, carClass, weigh, driver, engine);
        this.capasityBody=capasityBody;
    }
}
