package homework;
import java.util.Scanner;
public class PositiveAndNegative {
    public static void main(String[] args) {
        //write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative//
        Scanner input=new Scanner(System.in);
        int count=0;
        int positive=0;
        int negative=0;
        do{
            System.out.println("Enter a number");
            int num=input.nextInt();
            if(num!=0){
                if (num>0) {
                    positive++;
                }else{
                    negative++;
                }
            }
        }while(++count<5);
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);

    }
}
