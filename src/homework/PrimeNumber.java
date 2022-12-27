package homework;

import java.util.Scanner;

public class PrimeNumber {
    /*
    [IQ] Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
    Input:
        11

    Output:
        prime

     */
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
    int num= input.nextInt();
    boolean prime=true;
    for (int i=2; i<num; i++){
        if(num%i==0){
            prime=false;
        }
    }
        System.out.println(prime);
    }
}
