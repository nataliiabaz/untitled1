package day05_arifmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        int pizzaSlices=10;
        int people= 3;
        int slicesForPerson = pizzaSlices/people;
        int leftOverSlices = pizzaSlices %people;
        System.out.println(slicesForPerson);
        System.out.println(leftOverSlices);
    }
}
