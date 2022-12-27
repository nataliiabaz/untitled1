package day31_arraylist.homework;

import java.util.ArrayList;

public class AddElements2 {
    /*
    Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Iron Man");
        words.add("Spider Man");
        words.add("Thor");
        words.add("Captain America");
        words.add("Hawkeye");
        System.out.println(words);
        words.remove(2);
        System.out.println(words);
        words.remove("Iron Man");
        System.out.println(words);
        words.remove(0);
        System.out.println(words);
        for(String each: words){
            System.out.println(each);
        }
    }
}
