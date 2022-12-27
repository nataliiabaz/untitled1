package day51_stream;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
        BiPredicate<int[], int[]> arrayEquals= (arr1, aar2)->{
            Arrays.sort(arr1);
            Arrays.sort(aar2);
            return Arrays.equals(arr1,aar2);
        };

        System.out.println(arrayEquals.test(new int[]{3,2,1}, new int[]{1,2,3}));
    }

}
