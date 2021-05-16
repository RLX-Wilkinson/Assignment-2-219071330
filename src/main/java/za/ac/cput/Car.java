package za.ac.cput;
/*
Author: Tauriq-Allie Wilkinson(219071330)
FileName: CarTest.java
DueDate: 16 May 2021
 */

public class Car {

    private String carName, carColor;

    public Car() {

    }

    public Car(String carName, String carColor) {
        this.carName = carName;
        this.carColor = carColor;
    }

    public String getcarName() {
        return carName;
    }

    public String getcarColor() {
        return carColor;
    }

    public void setcarName(String carName) {
        this.carName = carName;
    }

    public void setcarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return    String.format("%10s\t%10s\t", carName, carColor);

    }
}
