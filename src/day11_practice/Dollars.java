package day11_practice;

public class Dollars {
    public static void main(String[] args) {
        int money = 97;
        int quarter = money / 25;
        money %= 25;
        int dimes = money / 10;
        money %= 10;
        int nickels = money / 5;
        money %= 5;
        int pennies = money;
        System.out.println("changes:");
        System.out.println(quarter + "quarter");
        System.out.println(dimes + "dimes");
        System.out.println(nickels + "nickels");
        System.out.println(pennies + "pennies");

    };
    }

