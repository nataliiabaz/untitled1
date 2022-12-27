package day42_abstraction.homework.building;

public class Apartment extends Building implements HasBalcony {
    /*
    Create an class Apartment
    child class of Building
    implements HasBalcony

    create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease

     */
    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }
    void pay(){
        System.out.println("Paying for apartment");
    }
      public void openBalcony(){
        System.out.println("Has balcony");
    }
}
