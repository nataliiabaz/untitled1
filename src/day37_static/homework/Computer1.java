package day37_static.homework;

public class Computer1 {
    public static void main(String[] args) {
        Computer computer1=new Computer(1200.80, "Lenovo Flex 5G", "black");
        System.out.println(computer1);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);
    }
}
