package day40_inheritance.overriding.homework.device;

import day40_inheritance.overriding.homework.device.Device;

public class Phone extends Device {
    /*
    Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
     */
    public Phone (String brand, String model, double price, boolean wireless){
        super(brand, model,price, wireless);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
    @Override
    public String useDevice(){
        return "Using phone";
    }
}
