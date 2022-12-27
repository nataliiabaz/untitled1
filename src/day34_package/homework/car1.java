package day34_package.homework;

public class car1 {
    public static void main(String[] args) {
       Car car1=new Car();
       car1.model="BMW";
       car1.year=2022;
       car1.color="bleak";
       car1.fuelLevel=50;
       System.out.println(car1.toString());
       car1.drive();
       car1.fillTank();
       car1.isLow();
       System.out.println(car1.isLow());
    }
}
