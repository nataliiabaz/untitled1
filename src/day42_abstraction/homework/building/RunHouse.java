package day42_abstraction.homework.building;

import day42_abstraction.homework.building.Apartment;
import day42_abstraction.homework.building.House;
import day42_abstraction.homework.building.OfficeBuilding;

public class RunHouse {
    public static void main(String[] args) {
       House house = new House("Arlington Hights", 307000, 4);
       Building house1 = new OfficeBuilding("Arlington Hights", 4579000, 6);
       Building house2 = new Apartment("Buffalo Grove", 55789, 2);
       house1.pay();
       house2.pay();
       System.out.println(house1);
       System.out.println(house2);
       HasElevator house3 = new OfficeBuilding("Buffalo Grove", 68787878, 5);
       house3.elevator(4);
       HasBackyard house4 = new House("Mundelian", 76675765, 7);
       house4.mowLawn();
       house.mowLawn();
       house.pay();
       System.out.println(house);
       Apartment apartment = new Apartment("Chicago", 150000, 3);
       apartment.pay();
       apartment.openBalcony();
       System.out.println(apartment);
       OfficeBuilding office = new OfficeBuilding("Chicago", 390000, 45);
       office.pay();
       office.elevator(45);
       System.out.println(office);
       Building house_5 = new House("Arlington Hights", 678990, 4);

       ((House)house_5).mowLawn();
       Building house_7=new OfficeBuilding("\"Arlington Hights",908777, 3);
       OfficeBuilding house_8=(OfficeBuilding) house_7;
       house_8.pay();
       house_8.elevator(3);


    }
}
