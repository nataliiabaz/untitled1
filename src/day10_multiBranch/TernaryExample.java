package day10_multiBranch;

public class TernaryExample {
    public static void main(String[] args) {
        int score=50;
        String result = score > 70?"Passing":"Falling";
        System.out.println(result);
        int n=9;
        System.out.println(n%2==0 ?"even":"odd");
    }
}
