package day16_string;
import java.util.Scanner;
public class FixName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName=scan.next().toLowerCase();
        System.out.println("Please enter your last name:");
        String lastName=scan.next().toLowerCase();
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println(firstName);
        System.out.println(lastName);

    }
}
