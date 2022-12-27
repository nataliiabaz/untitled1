package homework;

public class Factorial {
    public static void main(String[] args) {
        //write a program that calculates the factorial of a number:
        //    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
        int n=7;
        int f=1;
        while(n>=1){
         f*=n--;
        }
        System.out.println("Factorial="+ f);
    }
}
