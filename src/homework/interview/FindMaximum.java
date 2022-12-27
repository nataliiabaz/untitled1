package homework.interview;

import java.util.Arrays;

public class FindMaximum {
    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array.
    public static int maxNum(int[] num) {

        int max = Integer.MIN_VALUE;

        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] num={65,89,34,76,3};
        System.out.println(maxNum(num));


        Arrays.sort(num);
        System.out.println(num[num.length-1]);
    }


}
