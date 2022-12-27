package day04_variables;

public class Recap {
    public static void main(String[] args) {
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        temperature=74.2;
        numberOfJavaDays=4;
        numberOfSoftSkillsDays=2;

        System.out.println("temperature = " + temperature+  "Celsius");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);

        int numberOfCoffeeCups=2;
        float ratingOfMovie=8.9F; // compiler takes 8.9 as double type
        long waterInOcean= 200_000_000L;

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean +  "Liters");



    }
}
