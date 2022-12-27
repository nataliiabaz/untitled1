package day25_practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,7,8,800};
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr,9));
        int [] b={6,2,-1,4,20,-14};
        System.out.println(Arrays.binarySearch(b,-14));
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b,-14));
        System.out.println(Arrays.binarySearch(b,0));
        String[] words= {"hello", "world", "zebra", "water"};
        Arrays.sort(words);
        System.out.println(Arrays.binarySearch(words, "hello"));
    }
}
