package day29_methods3.homework;

import java.util.Arrays;

public class Practice {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array

     */
    public static int smallestNumber(int[] nums) {

        int smallestNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (smallestNumber > nums[i]) {
                smallestNumber = nums[i];

            }
        }
        return smallestNumber;

    }
    public static void main(String[] args) {
        int[] nums = {12, 34, -87, 45, 87};
        int num = 12;
        String[] words={"java", "is", "the", "best"};

        String[] allElements= addElement(words, "language");

        System.out.println(smallestNumber(nums));
        System.out.println(biggestNumber(nums));
        System.out.println(contains(nums, num));
        System.out.println(indexOf(nums, num));
        System.out.println(Arrays.toString(allElements));
    }
    /*
    Max Number

create a method that will accept an int array and return the biggest number from the array

     */
    public static int biggestNumber(int[] nums) {

        int number = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (number < nums[i]) {
                number = nums[i];

            }
        }
        return number;

    }

    /*
    Contains

    create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */
    public static boolean contains(int[] nums, int number) {
        boolean isContains = false;
        for (int each : nums) {
            if (each == number) {
                isContains = true;
            }
        }
        return isContains;

    }
    /*
    IndexOf

create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index

     */
    public static int indexOf(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    /*
    Add Element

create a method that will accept a String array and a String element. Add the given element value into the end of
 the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to
  fit all the original elements plus the new one

     */
    public static String[] addElement(String[] arr, String element){
        String [] newArr=new String[arr.length+1];
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];

        }
        newArr[newArr.length-1]=element;
        return newArr;
    }
    /*
    Add Element
        overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.
        Ex:
            {"today", "is", "monday"}
            {"no", "softskills", "today"}
        output > [today, is, monday, no, softskills, today]
             */

    public static String[] addElement(String[] original, String[] other){

        String[] merged = new String[original.length + other.length];

        for(int i = 0; i < original.length; i++) { // copy the elements from the original array to the new array
            merged[i] = original[i];
        }

        // option: int i = 0, j = original.length; j++ --> merged[j]
        for(int i = 0; i < other.length; i++){ // read the elements from the other array and store them into the merged array
            merged[original.length + i] = other[i];
        }
//[today, is, monday, no, softskills, today]
        return merged;
    }


}
