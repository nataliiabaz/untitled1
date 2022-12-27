package day15_practice;
import java.util.Scanner;
public class ValidWebsite {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you website");
        String website=scan.next();
        boolean validStart=website.startsWith("www.");
        boolean validEnd=website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net");
        if(validStart&&validEnd) {
            System.out.println(website + " is valid");
        }else{
            System.out.println(website + " is invalid");
            if(!validStart){
                System.out.println("Website should start with www. ");

            }
            if(!validEnd){
                System.out.println("Website should end with .com or .edu or .gov or .net");
            }
        }
        }
    }



