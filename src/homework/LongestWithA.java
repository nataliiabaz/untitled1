package homework;
import java.util.Scanner;
public class LongestWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 words:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();


        if (word1.contains("a")&& word1.length() >word2.length() && word1.length() >word3.length()) {
                System.out.println(word1);
            } else if (word2.contains("a")&& word2.length() > word1.length() && word2.length() > word3.length()) {
                System.out.println(word2);
            } else if (word3.contains("a") && word3.length() >word1.length() && word3.length() > word2.length()) {
                    System.out.println(word3);
            } else {
                    System.out.println("no one word was the longest");
                }
            }
        }
