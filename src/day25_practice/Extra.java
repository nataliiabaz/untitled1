package day25_practice;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String [] str={"hello", "words", "monday"};
        System.out.println(Arrays.toString(str));
        System.out.println(String.join("#", str));
        System.out.println(String.join(" ", str));
        System.out.println(String.join("MIDDLE", str));
        int [] aa=new int[]{1,5,2,5};
        System.out.println(Arrays.toString(new int[]{1,5,2,5}));

    }
}
