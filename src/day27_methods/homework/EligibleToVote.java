package day27_methods.homework;

public class EligibleToVote {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
    public static void EligibleToVote(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {

        EligibleToVote(56);
    }
}
