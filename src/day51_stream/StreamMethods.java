package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 5, 12, 12, 5, 5,9,8,6,4,10));
        list1=list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        list1.stream().skip(1).collect(Collectors.toList());
        list1=list1.stream().limit(10).collect(Collectors.toList());
        System.out.println(list1);
        list1=list1.stream().map(p->{if(p%2!=0)return p*2; else return p;}).collect(Collectors.toList());
        System.out.println(list1);
        list1=list1.stream().filter(p->p%3==0).collect(Collectors.toList());
        System.out.println(list1);
        list1=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);


    }
}
