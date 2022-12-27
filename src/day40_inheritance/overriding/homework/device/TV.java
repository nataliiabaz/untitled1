package day40_inheritance.overriding.homework.device;

import day40_inheritance.overriding.homework.device.Device;

public class TV extends Device {
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
     */
    public TV(String brand, String model, double price, boolean wireless){
        super(brand, model,price, wireless);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
    @Override
    public String useDevice(){
        return "Using TV";
    }
}
