package day18_practice;

import java.util.Scanner;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2147483648;
        int min= 2147483647;
        int num=0;
        while(num++<5){
            System.out.println("Enter a number");
            int inputNum=input.nextInt();
            if (inputNum>max){
                max=inputNum;
            }
            if(inputNum<max) {
                min = inputNum;
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);


    }
}
