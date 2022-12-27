package day18_practice;
import java.util.Scanner;
public class Bot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean run=true;
        System.out.println("Bot is awake");
        while(run){
            System.out.println("Enter your message");
            String msg=input.nextLine();
            switch(msg){
                case"hello":
                    System.out.println("how are you?");
                    break;
                case"what is your age":
                    System.out.println("I was programmed in July");
                    break;
                default:
                    System.out.println("Sorry I didn't get that");
                case"shutdown" :
                    run=false;

            }


        }

    }
}
