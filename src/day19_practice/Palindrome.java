package day19_practice;

public class Palindrome {
    public static void main(String[] args) {
        //anna, racecar, maam//
        String p="racecar";
        String reverse="";
        for(int i=p.length()-1; i>=0; i--){
            reverse+=p.charAt(i);

        }
         if(p.equals(reverse)) {
             System.out.println("Palindrome");
         }else {
             System.out.println("Not palindrome");
         }
        System.out.println(p.equals(reverse)? "Palindrome": "Not palindrome");

         }
    }

