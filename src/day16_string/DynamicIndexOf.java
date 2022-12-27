package day16_string;

public class DynamicIndexOf {
    public static void main(String[] args) {
        String str="definition";
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i',4));
        System.out.println(str.indexOf('i',6));
        int first= str.indexOf('i');
        int second=str.indexOf('i', first+1);
        System.out.println(first);
        System.out.println(second);


    }
}
