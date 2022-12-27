package day18_practice;

public class EvenAndOdd {
    public static void main(String[] args) {
        int limit=100;
        int count=1;
        //printing all the even numbers:
        while (count <= limit) {//run for limit number of times.

            if(count%2==0){
                System.out.print(count+" ");
            }
            count++;
            int back=limit;
            while(back>=1){
                if(back%2==1){
                    System.out.print(back+" ");
                }
             back--;
            }
        }
    }
}
