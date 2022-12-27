package day42_abstraction.homework.building;

import day42_abstraction.homework.building.Building;
import day42_abstraction.homework.building.HasBackyard;

public class House extends Building implements HasBackyard {
    /*
    Create an class House
    child class of Building
    implements HasBackyard

    create instance variable
        int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents
     */
    int numOfResidents;

    public House(String location, double price, int numOfResidents) {
        super(location, price);
        this.numOfResidents = numOfResidents;
    }
    public void mowLawn(){
        System.out.println("Going into Backyard");
}
      void pay(){
        System.out.println("Paying for House");
    }

    @Override
    public String toString() {
        return "House{" +
                "numOfResidents=" + numOfResidents +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
