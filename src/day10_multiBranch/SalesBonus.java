package day10_multiBranch;

public class SalesBonus {
    public static void main(String[] args) {
        int sales=3000;
        int bonus=0;
        if(sales>=10000&& sales<15000){
            bonus=5000;
        }
        if(sales>=15000){
            bonus=7000;
        }
        System.out.println("Sales:"+sales);
        System.out.println("Bonus:"+bonus);
    }
}
