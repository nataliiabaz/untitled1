package day26_practice.homework;

import java.util.Arrays;

public class Merge {
    /*
    Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]
     */
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30}, {5, 10, 15},{1,2,3}
        };
        int size=0;
        for(int[]eachArray: nums){
            size+=eachArray.length;
        }
        int[] merged=new int[size];//count the total number of elements i will need to loop
        int indexToStore=0;
        for(int[] eachArray: nums){
            for(int eachNum: eachArray){
                merged[indexToStore++]=eachNum;

            }
        }
        System.out.println(Arrays.toString(merged));


    }
}


