package homework.interview;

import java.util.Arrays;

public class sortArrayDescending {
    //Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static int[] sortingArrayDes(int[] arr) {

        

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
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
        System.out.println(Arrays.toString(sortingArrayDes(arr)));
    }

    }

