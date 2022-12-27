package day31_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();
        System.out.println(letters.size());//-->empty
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(letters.size());// number of elements ->4
        System.out.println(letters);
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters);
        letters.add(0, '$');
        System.out.println(letters);
        letters.add(3, '8');
        System.out.println(letters);
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Nataliia");
        names.add("Oleh");
        names.add("Roman");
        names.add("Yuriy");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Nataliia"));
        System.out.println(names.isEmpty());
        System.out.println(names.remove(2));
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        String name[] = {"Nataliia", "Roman"};
        System.out.println(Arrays.toString(name));
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList(name));
        System.out.println(names1);
        System.out.println(names1.get(0));
        System.out.println(names1.get(1));
        System.out.println(names1.set(0, "Yuriy"));
        System.out.println(names1.remove(0));
        System.out.println(names1.remove("Nataliia"));
        names1.add("Maria");
        names1.add("Vira");
        names1.add("Lera");
        System.out.println(names1);
        System.out.println(names1.indexOf("Maria"));
        System.out.println(names1.isEmpty());
        Collections.reverse(names1);
        System.out.println(names1);
        Collections.reverse(names1);
        int count = 0;
        for (String each : names1) {
            if (each.contains("Vira")) {
                count++;
            }
        }
        System.out.println(count);
        }

    }


