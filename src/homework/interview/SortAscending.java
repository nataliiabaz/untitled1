package homework.interview;

import java.util.Arrays;

public class SortAscending {
    //Question2: Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static int[] sortArrayAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }
        public static void main(String[] args) {
            int[]arr={56,89,34,20,78};
            System.out.println(Arrays.toString(sortArrayAscending(arr)));
        }


    }



