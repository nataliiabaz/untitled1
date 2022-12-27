package day37_static.car;

public class Car {
    String model;
    Driver driver;
    public Car(String model, String name, long licenseNumber, char licenseType ){
        this.model=model;
        driver= new Driver(name,licenseNumber, licenseType);// creating a Driver object
    }
    public Car(String model, Driver driver){
        this.model=model;
        this. driver=driver;
    }
}
