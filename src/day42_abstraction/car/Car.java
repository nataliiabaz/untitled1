package day42_abstraction.car;

public abstract class Car {
    /*
Create an abstract class Car

    define an abstract method start (void)

Create a concrete class Toyota
    sub class of Car

    override the start method to print:
        turning key to start

Create a concrete class BMW
    sub class of Car

    override the start method to print:
        pressing button to start

Create a abstract class ElectricCar
    sub class of Car

    define an abstract method charge (void)

Create a concrete class Tesla
     sub class of ElectricCar

    override the start method to print:
        key card near by, starting car

    override the charge method to print:
        at tesla charging station
 */
    public abstract void start();
}
