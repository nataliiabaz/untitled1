package homework;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4*/
        Scanner input=new Scanner(System.in);

        System.out.println("Write a sentence");
        String s=input.nextLine().trim();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char w=s.charAt(i);
            if(w==' '){
                count++;
            }

        }
        count+=1;
        System.out.println(count);

    }
}
