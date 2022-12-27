package day42_abstraction.car;

public class  Tesla extends ElectricCar {
    @Override
    public void charge() {
        System.out.println("at tesla charging station");
    }

    @Override
    public void start() {
        System.out.println("key card near by, starting car");
    }
}
