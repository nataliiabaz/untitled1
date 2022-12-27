package day10_multiBranch;

public class BiggestNumber {
    public static void main(String[] args) {
        int n=1;
        int n2=11;
        int num3=5;
        int biggest;
        if (n>n2 && n>num3){
            System.out.println(n+" is the biggest");
            biggest=n;
        }else if(n2>n && n2>num3){
            System.out.println(n2+" is the biggest");
            biggest =n2;
        }else{
            System.out.println(num3+" is the biggest");
            biggest =num3;
        }
    }
}
