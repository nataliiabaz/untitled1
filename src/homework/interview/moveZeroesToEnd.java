package homework.interview;

import java.util.Arrays;

public class moveZeroesToEnd {
    // Question 3: Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input: {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }

    public static void main(String[] args) {
        int []array={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(array)));
    }

}
