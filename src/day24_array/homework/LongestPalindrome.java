package day24_array.homework;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] str2 = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna" };
        String [] str={"abc", "dna", "kevin","joe","lamp"};
        String longestPal = "";
        for (int i = 0; i <str.length; i++) {
            String reverse = "";
            for (int j = str[i].length() - 1; j >= 0; j--) {
                reverse += str[i].charAt(j);
            }
            if (reverse.equals(str[i]) &&  longestPal.length()< reverse.length()) {
                longestPal = str[i];

            }
        }
            if(longestPal.length()==0){
            longestPal="No palindrome";
        }
        System.out.println(longestPal);


    }

}







