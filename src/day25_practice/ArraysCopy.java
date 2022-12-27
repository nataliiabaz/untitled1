package day25_practice;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[]other=nums;
        nums[0]=10;
        other[2]=25;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int [] a={5,10,15};
        int [] b=Arrays.copyOf(a,3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays. toString(b));
        a[1]=100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays. toString(b));


    }
}
