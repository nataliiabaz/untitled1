package day11_practice;

public class Retake {
    public static void main(String[] args) {
        double grade=75;
        int attemptNumber=2;
        double finalGrade=0;
        if(attemptNumber==1) {
            finalGrade = grade * 0.9;
        }else if(attemptNumber==2) {
            finalGrade = grade * 0.8;
        }else if(attemptNumber==3) {
            finalGrade = grade * 0.65;
        }
            System.out.println(finalGrade);
        }
    }

