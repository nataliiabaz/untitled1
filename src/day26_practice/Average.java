package day26_practice;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int totalSum=0;
        int totalElements=0;
        int[][] nums={
                {3,5,1,2},
                {2,1,5,7,},
                {3,1,5,12}

        };
        for( int[] eachInner : nums){
            int sum=0;
            for(int eachNum : eachInner){
                sum+=eachNum;
            }
            System.out.println(Arrays.toString(eachInner));
            System.out.println("Average:"+ (double)sum/eachInner.length);
            totalSum+=sum;
            totalElements+=eachInner.length;
        }
        System.out.println("Total average of num:"+ (double)totalSum/totalElements);

    }
}
