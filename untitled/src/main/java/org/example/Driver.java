package org.example;

import java.util.Objects;

public class Driver extends Person{
    private String name ;
    private int drivingExp ;

   public Driver(String name, int drivingExp) {
        this.name=name;
        this.drivingExp=drivingExp;
    }

    @Override
    public String toString() {
        return "Name of driver is "+ name + ", exp of driver is " + drivingExp+ " years";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (drivingExp != driver.drivingExp) return false;
        return Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + drivingExp;
        return result;
    }
}
