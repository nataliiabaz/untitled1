package homework.interview;

import java.util.Arrays;

public class concatArrays {

//    Array - Concat two arrays
//    Write a return method that can concate two arrays

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr1={5,8,9,3};
        int[] arr2={6,3,2,1};
        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));

    }
}
