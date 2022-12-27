package day16_string;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstname=scan.next();
        System.out.println("Please enter your last name");
        String lastname=scan.next();
        String initials= "" + firstname.charAt(0)+lastname.charAt(0);
        System.out.println("first name"+firstname);
        System.out.println("last name"+lastname);
        System.out.println(initials.toUpperCase());
    }
}
