package day26_practice.homework;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {


    /*
    Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
     */
    int[][] nums={
        {1, 5, 2, 23},
        {-12, 41, -5, -2},
        {1, 5, 1, 5}
    };
        Arrays.sort(nums[0]);
        Arrays.sort(nums[1]);
        Arrays.sort(nums[2]);
        int min=nums[0][0];
        int max=nums[0][3];

        for( int[] eachInner: nums){
            System.out.println(Arrays.toString(eachInner));
            for(int eachNum : eachInner){
                if(min>eachNum){
                    min=eachNum;
                    System.out.println("min:"+min);

                }
                if(max<eachNum){
                    max=eachNum;
                    System.out.println("max:"+max);
                }
            }

        }
}}
