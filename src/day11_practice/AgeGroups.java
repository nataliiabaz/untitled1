package day11_practice;

public class AgeGroups {
    public static void main(String[] args) {
        int age=50;
        if(age>=0&& age<=120) {
           if(age<=1) {
               System.out.println("Baby");
           }else if(age<=5){
               System.out.println("Toddler");
           }else if(age<=13){
               System.out.println("Kid");
           }else if(age<=18){
               System.out.println("Teenager");
           }else if(age<=30){
               System.out.println("Adult");
           }else if(age<=65){
               System.out.println("Middle aged Adult");
           }else {
               System.out.println("Senior");
           }


        }else{
            System.out.println(age+ "is not a valid age");
        }
    }
}
