package day27_methods.homework;

import java.util.Scanner;

public class PositiveNegativeZero {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void PositiveNegativeZero(int num){
        if(num>0){
            System.out.println("Positive number: "+num);
        }
        if(num<0){
            System.out.println("Negative number: "+num);
        }else if(num==0){
            System.out.println("Number is zero: "+num);

        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero(0);
        Scanner input=new Scanner(System.in);
        PositiveNegativeZero(input.nextInt());
    }

}
