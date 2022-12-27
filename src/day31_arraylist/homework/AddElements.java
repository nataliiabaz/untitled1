package day31_arraylist.homework;

import day27_methods.Car;

import java.util.ArrayList;

public class AddElements {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hat");
        words.add("Shoes");
        System.out.println(words);
        words.add(1,"Jacket");
        System.out.println(words);
        words.add(0,"Towel");
        System.out.println(words);
        words.add(1,"Car");
        System.out.println(words);

    }
}
