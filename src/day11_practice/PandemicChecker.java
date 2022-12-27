package day11_practice;
import java.util.Scanner;
public class PandemicChecker {
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
        System.out.println("What year would you like to check?");
        int year= input.nextInt();
        if(year>=1346 && year<=1353){
            System.out.println("The Black Death");

        }
    }
}
