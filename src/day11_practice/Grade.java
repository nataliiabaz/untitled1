package day11_practice;

public class Grade {
    public static void main(String[] args) {
        int score = 50;
        if (score >= 75) {
            System.out.println("Passed");

            if (score >= 92) {
                System.out.println("You did really well");
            } else {
                System.out.println("Good job");
            }

        } else {
            System.out.println("Failed");

        }

    }   }
