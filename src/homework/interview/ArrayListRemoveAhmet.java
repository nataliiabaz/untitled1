package homework.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmet {
    //ArrayList - Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {

        ArrayList<String>arr=new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        arr.removeAll(Arrays.asList("Ahmed"));
        System.out.println(arr);

        }

    }



