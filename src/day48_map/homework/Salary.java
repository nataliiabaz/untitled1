package day48_map.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Salary {
    public static void main(String[] args) {
        /*
        Map Practice

Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K

         */
        Map<String, Integer> person1 = new HashMap<>();
        person1.put("Nataliia", 150_000);
        person1.put("Roman",180_000);
        person1.put("Yuriy",180_000);
        person1.put("Oleh", 300_00);

        Integer min=0;
        Integer max=0;

        for( Integer each: person1.values()){


                if(min>person1.get(each)){
                    min=person1.get(each);
                    System.out.println("min:"+min);

                }
                if(max<person1.get(each)){
                    max= person1.get(each);
                    System.out.println("max:"+max);
                }
            }

    }
}
