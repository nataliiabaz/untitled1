package day19_practice;

public class CountLetter {
    public static void main(String[] args) {
        //word java how many chars?//
        String word="java";
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
