package day20_loops;

public class CountCharacters {
    public static void main(String[] args) {
        String s="2khjghd76Hjk8hg";
        int upper=0,lower=0,number=0;
        for (int i=0; i<s.length(); i++){
            char eachLetter=s.charAt(i);
            if (eachLetter>='A'&&eachLetter<='Z') {
                upper++;
            }else if(eachLetter>='a'&&eachLetter<='z') {
                lower++;
            }else if(eachLetter>='0'&&eachLetter<='9') {
                number++;
            }
        }
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);
        System.out.println("Number: "+number);
    }
}
