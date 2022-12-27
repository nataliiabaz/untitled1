package day41_exceptions;

public class exception{
    public static void main(String[] args) {
        try {
            int a = 5;
            System.out.println(a / 0);
            System.out.println("WE checked ");
        } catch (ArithmeticException e) {
            System.out.println("We can't divide by 0");
            System.out.println(e.getMessage());
        }
    }   }