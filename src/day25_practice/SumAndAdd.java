package day25_practice;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {
        int[] arr= {5,7,9};
        int sum= 0;
        for( int each: arr){
            sum+= each;
        }
        int[] newArr = Arrays.copyOf(arr, arr.length +1);
        System.out.println(Arrays.toString(newArr));
        newArr[newArr.length-1]=sum;
        System.out.println(Arrays.toString(newArr));

    }
}
