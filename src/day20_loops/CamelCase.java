package day20_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str= input.nextLine().toLowerCase();
        String camelCase="";
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)==' ') {
                camelCase+=str.substring(i+1,i+2).toUpperCase();
                i++;
            }else{
                camelCase +=str.charAt(i);
            }
        }
        System.out.println(camelCase);

    }
}
