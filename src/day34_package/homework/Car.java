package day34_package.homework;

import java.sql.SQLOutput;

public class Car {
    /*
    Create a class Car

create instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */
    String model;
    int year;
    String color;
    int fuelLevel;


    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public void drive() {
            System.out.println("Driving model : " + model);
            fuelLevel -= 5;

        }
    public void fillTank(){
        System.out.println("Filling tank : " + fuelLevel);
        int fuelLevel=100;
        System.out.println("Max: "+fuelLevel);

    }
    public boolean isLow() {
        return fuelLevel < 25 ? true : false;
    }

}
