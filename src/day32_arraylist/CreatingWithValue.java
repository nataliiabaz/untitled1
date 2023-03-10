package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValue {

        public static void main(String[] args) {

            // convert array to ArrayList

            int[] arr = {3, 5, 1, 1};

            Arrays.asList(arr); // converts the array to ArrayList

            // Create an ArrayList with initial values

            Integer[] arr2 = {3, 4, 4, 6};
            ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr2));

            // Arrays.asList(arr) -> arr is not valid because it is int primitive types, so we needed to create an array of wrapper class Integer values (arr2)

            // The way we will usually create an ArrayList

            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 5, 1, 4));
            System.out.println(list);

            ArrayList<String> names = new ArrayList<>(
                    Arrays.asList("james", "adam", "ana", "jane")
            );
            System.out.println(names);

        }
    }

