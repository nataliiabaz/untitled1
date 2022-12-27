package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int num= scan.nextInt();
        String[]seasons={"winter","spring","summer","fall"};
        if(num>=1 && num<=4){
            System.out.println(seasons[num-1]);
        }else{
            System.out.println("invalid number5");
        }


    }
}
