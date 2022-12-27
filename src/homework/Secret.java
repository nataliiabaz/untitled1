package homework;

import java.util.Scanner;

public class Secret {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess secret number");

        int secret = 86;
        int attempts = 1;

        for (int i = 1; i <= 100; i++  ){
            int guess = input.nextInt();

            if (guess == secret){
                System.out.println("You got the secret number");
                break;
            } else if (guess < secret) {
                System.out.println("secret number is bigger");
            } else if (guess > secret ) {
                System.out.println("secret number is smaller");
            }
            attempts++;

        }
        System.out.println("number of attempts: " + attempts);





    }
}







