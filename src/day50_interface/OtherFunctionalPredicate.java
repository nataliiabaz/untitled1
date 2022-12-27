package day50_interface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class OtherFunctionalPredicate {
    public static void main(String[] args) {


    BiPredicate<int[], Integer> contains= (arr, num) -> {
            for(int each: arr){
                if(each==num){
                    return true;
                }
            }
            return  false;
    };

    int[] arr={4,6,13,5,12,5,6,6};
        System.out.println(contains.test(arr, 6));
        System.out.println(contains.test(arr,8));
    }

    BiConsumer <Integer,Integer> multiplicationTable= (num, max) -> {

        for (int i = 1; i<=max; i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
        };



}
