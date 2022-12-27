package day19_practice;
import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber=87;
        int inputNumber;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Guess a number");
            inputNumber = input.nextInt();
            if (inputNumber < secretNumber) {
                System.out.println("secret number is higher");
            } else if (inputNumber > secretNumber) {
                System.out.println("secret number is lower");
            }
        }while(secretNumber!=inputNumber);
        System.out.println("you guessed the number");
        }
    }



