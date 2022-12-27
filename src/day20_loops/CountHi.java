package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        String s3="jkgkfjhikgfhgkfh";
        int count3=0;
        for(int i=0; i<s3.length()-1; i++){
            if(s3.substring(i,i+2).equals("hi")){
                count3++;
            }
        }
        System.out.println(count3);
    }
}
