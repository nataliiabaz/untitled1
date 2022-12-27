package day20_loops;

public class Prime {
    public static void main(String[] args) {
        int n=12;
        boolean isPrime=true;
        for(int i=2; i<n; i++){
            if(n % i==0){
                isPrime=false;

            }
        }
        System.out.println(isPrime?"Prime":"Not prime");
    }
}
