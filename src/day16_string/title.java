package day16_string;
import java.util.Scanner;
public class title {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name");
        String word1 = scan.next();
        word1=word1.toLowerCase();
        if (word1.startsWith("mr")||word1.startsWith("mister")) {
            System.out.println("Hello Sir");
        }else if(word1.startsWith("ms")||word1.startsWith("miss")) {
            System.out.println("Hello Ma'am");
        }else if(word1.startsWith("dr")){
            System.out.println("Hello doctor");
        }
        if (word1.endsWith("sr")) {
            System.out.println("Nice to meet you Senior");
        }else if(word1.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        }
    }


}
