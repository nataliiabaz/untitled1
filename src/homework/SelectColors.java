package homework;
import java.util.Scanner;
public class SelectColors {
    public static void main(String[] args) {
        /*write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected*/
        Scanner input=new Scanner(System.in);
        int num = 0;
        String getColours = "";
        String selectedColours = "";
        while(num++<3){
            System.out.println("What color would you like to select?");
            getColours = input.nextLine();
            if(selectedColours.contains(getColours)) {
                System.out.println("Color need to be unique");
            }else{
                System.out.println(selectedColours+=+num +getColours);
            }

        }


    }
}
