package day22_array;

import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        String city1="Chicago";
        String city2="Boston";
        String city3="Miami";
        String city4="New York";
        String city5="Toronto";
        String city6="Houston";
        String[]cities={"Chicago","Boston","Miami","New York","Toronto","Houston"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);
        Arrays.toString(cities);
        System.out.println(Arrays.toString(cities));
        double[]prices=new double[4];
        prices[0]=12.99;
        System.out.println(Arrays.toString(prices));
        prices[1]=1.99;
        prices[2]=2.99;
        prices[3]=10.99;
        System.out.println(Arrays.toString(prices));
    }
}
