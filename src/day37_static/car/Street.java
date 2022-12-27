package day37_static.car;

import day37_static.car.Car;

public class Street {
    public static void main(String[] args) {
        Car bmw=new Car("X5","James",
                456743,'c');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
    }
}
