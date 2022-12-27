package day24_array;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="Today is Friday";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse="";
        for(String each :words){
            String eachReverse="";
            for(int i=each.length()-1; i>=0; i--){
                eachReverse+=each.charAt(i);

            }
            reverse+=eachReverse+" ";

        }
        System.out.println(reverse);
    }
}
