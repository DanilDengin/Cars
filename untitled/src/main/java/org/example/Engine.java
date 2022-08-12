package org.example;

import java.util.Objects;

public class Engine {
    private int horsepower ;
    private String maker ;

    public Engine(int horsepower, String maker) {
        this.horsepower = horsepower;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Horsepower is  "+ horsepower + ", engine's maker is " + maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (horsepower != engine.horsepower) return false;
        return Objects.equals(maker, engine.maker);
    }

    @Override
    public int hashCode() {
        int result = horsepower;
        result = 31 * result + (maker != null ? maker.hashCode() : 0);
        return result;
    }
}
