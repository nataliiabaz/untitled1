package day24_array.homework;

import java.util.Arrays;

public class TwoValues {
    public static void main(String[] args) {
        String app="google";
        String zone="us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
        String [] zone2=zone.split("#");
        for (int i = 0;  i<zone2.length ; i++) {
            System.out.println("Deploying "+ app +" to "+ zone2[i]);
            System.out.println("Deployment completed " +zone2[i]);


        }

    }
}
