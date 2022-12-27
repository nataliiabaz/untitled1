package homework;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number of the day:");
        int num= scan.nextInt();
        String[]day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if(num>=1 && num<=7){
            System.out.println(day[num-1]);
        }else{
            System.out.println("it's invalid number");
        }
    }
}
