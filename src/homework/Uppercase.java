package homework;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Uppercase {
    public static void main(String[] args) {
        /*Declare and assign a String
        //print the String in all uppercase format and
        //print the String in all lowercase format
        //
        //-----------------------------------------------------------
        //
        //Declare and assign a String for password
        //the password should be more than 8 character long
        //print: Valid password or Invalid password
        //
        //-----------------------------------------------------------
        //
        //Use scanner to read a String from the console
        //Remove extra spaces in the beginning or end
        //Print in all lowercase
        //Print the number of characters*/
        String task1= "Today was crazy day for me";
        System.out.println(task1.toUpperCase());
        System.out.println(task1.toLowerCase());
        String password= "912391";
        int len=password.length();
        if(len<=8) {
            System.out.println("valid password");
        }else{
        System.out.println("invalid password");
        }

            System.out.println();
            Scanner input=new Scanner(System.in);
            String task2=input.next();
            System.out.println(task2.trim());
            System.out.println(task2.toLowerCase());
            System.out.println(task2.length());




    }



    }

