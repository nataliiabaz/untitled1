package homework;
import java.util.Scanner;
public class
        NegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Write a program that calculates the sum of numbers entered by the user until user enters a negative number. */
        int sum = 0;
        int num = 0;
        while (num >= 0){
            System.out.println("Enter a number:");
            num = input.nextInt();
            if (num >= 0) {
                sum += num;
                num++;
            }
        }


        System.out.println(sum);

    }   }
