package day30_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {
        int[] a={4,2,1};
        System.out.println("Number of elements:"+ a.length);
        System.out.println("Print the whole array:"+ Arrays.toString(a));
        System.out.println("Access the first element:"+ a[0]);
        ArrayList<Integer> nums=new ArrayList<>();
        System.out.println("Number of elements: "+nums.size());
        System.out.println("Print whole ArrayList: "+nums);
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
