package day33_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    Remove Duplicates

Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers


Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */
    public static ArrayList<Integer>duplicates(ArrayList <Integer> numbers) {

        numbers.removeIf(num -> Collections.frequency(numbers, num) > 1);
        return numbers;

    }

    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(duplicates(numbers));
    }


}
