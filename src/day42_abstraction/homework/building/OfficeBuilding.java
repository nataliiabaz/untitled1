package day42_abstraction.homework.building;

import day42_abstraction.homework.building.Building;
import day42_abstraction.homework.building.HasElevator;

public class OfficeBuilding  extends Building implements HasElevator {
    /*
    Create an class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
     */
    int numOfFloors;

    public OfficeBuilding(String location, double price, int numOfFloors) {
        super(location, price);
        this.numOfFloors = numOfFloors;
    }
    void pay(){
        System.out.println("Paying for office building");
    }
    public void elevator(int numOfFloors){
        System.out.println("Number of floors are "+numOfFloors);
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numOfFloors=" + numOfFloors +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

}
