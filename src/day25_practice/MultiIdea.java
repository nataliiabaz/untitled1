package day25_practice;

import java.util.Arrays;

public class MultiIdea {
    public static void main(String[] args) {
        int[] a={1,2,3,};
        int[] b={4,5,6,};
        int[] c={7,8,9,};
        int[][] all={a,b,c};
        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));
        System.out.println(Arrays.toString(all[2]));
        System.out.println((all[0][0]));
        System.out.println((all[1][0]));
        System.out.println((all[2][0]));
    }
}
