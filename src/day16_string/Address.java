package day16_string;
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you address");
        String address = scan.nextLine();
        address=address.toUpperCase();
        address=address.trim();

    }

}
