package day33_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class NewPalindrome {
    /*
    All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye

     */


    public static ArrayList<String> palindromes(ArrayList<String> list) {
        ArrayList<String> palindromes = new ArrayList<>();

        for (String each : list) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }
            if(reverse.equalsIgnoreCase(each)){
                palindromes.add(each);
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(palindromes(list));


    }
}
