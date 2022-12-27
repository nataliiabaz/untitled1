package day06_boolean;

public class Driving {
    public static void main(String[] args) {

        int mySpeed=80;
        boolean speeding= mySpeed>=50;
        boolean noSpeeding=mySpeed<=50;
        System.out.println("speeding:"+speeding);
        System.out.println("noSpeeding:" +noSpeeding);

        int number= -4;
        boolean isPositive= number > 0;
        boolean isNegative=number < 0;
        boolean isZero= number==0;
        System.out.println(isPositive);
        System.out.println(isNegative);
        System.out.println(isZero);

        int num= 5;
        boolean isEven= num % 2==0;
        boolean isOdd= num %2 !=0;// num %2==1
        System.out.println(isEven);
        System.out.println(isOdd);

    }
}
