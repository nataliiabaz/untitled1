package day29_methods3.homework;

import java.util.Arrays;

public class ReturnType {
    public static void main(String[] args) {
        int[] nums = {12, 34, -87, 45, 87};
        int num = 12;
        int small = Practice. smallestNumber(nums);
        int max=Practice.biggestNumber(nums);
        boolean b=Practice.contains(nums, num);
        System.out.println(small);
        System.out.println(max);
        System.out.println(b);
        int []c={4,5,2,7};
        System.out.println(Practice.indexOf(c,5));
        String[] words={"java", "is", "the", "best"};
        String[] allElements= Practice.addElement(words, "language");
        System.out.println(Arrays.toString(allElements));
    }

}
