package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumbersInWords {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

        Ex:
> 1
        one

                > 10
        ten*/
        Scanner scan=new Scanner(System. in);

        System.out.println("Enter the number:");
        int num= scan.nextInt();
        String[]str={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen"};
        if(num>=0 && num<=15){
            System.out.println(str[num]);
        }else{
            System.out.println("invalid number");

        }
    }
}
