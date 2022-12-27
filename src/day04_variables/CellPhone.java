package day04_variables;

public class CellPhone {
    public static void main(String[] args) {


      String brand="Apple";
      String model="IPhone X";
      String color="Rose Gold";
      double price=1000.99;
      boolean hasCamera=true;
      int size=128;
      char sim='A';
        System.out.println("\t\tPhone information;\nBrand:"+brand);
        System.out.println(model+" in color "+color);
        System.out.println("With "+size+ " gb the price is $ " +price);
        System.out.println("sim tipe: " +sim+" and has a camera:"+ hasCamera);

    String report= "\t\tPhone information;\nBrand:"+brand+
            "\n"+model+"in"+color+
            "\nWith"+size+ "gb the price is $" +price+
            "\nsim tipe:" +sim+" and has a camera:"+ hasCamera;
        System.out.println(report);
        byte prices = 127;

    }
}
