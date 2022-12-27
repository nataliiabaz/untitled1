package day29_methods3;

public class VarArgEx {
    public static void main(String[] args) {
        int[] a={3,4,6,8};
        dynamic(a);
    }
    public static void dynamic(int...nums){
        for(int each: nums){
            System.out.print(each+" ");
        }
    }
}
