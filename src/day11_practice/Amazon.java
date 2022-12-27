package day11_practice;

public class Amazon {
    public static void main(String[] args) {
        double price=10.99;
        boolean isPrime=true;

        if(isPrime) {
            System.out.println("Free 2 day shipping");
        }else{

            if(price>=25) {
                System.out.println("Free shipping available");
            }else{
                System.out.println("shipping cost is $2.99");
            }
        }
    }
}
