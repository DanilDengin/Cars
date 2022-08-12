package org.example;

import java.util.Objects;

public class Car {
    private String brand  ;
    private String carClass ;
    private int weigh ;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weigh, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weigh = weigh;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Повторот налево");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (weigh != car.weigh) return false;
        if (!Objects.equals(brand, car.brand)) return false;
        if (!Objects.equals(carClass, car.carClass)) return false;
        if (!Objects.equals(driver, car.driver)) return false;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        result = 31 * result + weigh;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Brand of car is " +brand+", car Class is "+ carClass+", weigh is "+ weigh+  "\n info driver: "+ driver+ "\n info engine: "+ engine;
    }



}
