package day37_static.homework;

public class Quiz {
    String topic;
    int totalNumberOfQuestions;
    double totalPoint;
    public Quiz(String topic,int totalNumberOfQuestions, double totalPoint ){
        this.topic=topic;
        this.totalNumberOfQuestions=totalNumberOfQuestions;
        this.totalPoint=totalPoint;
    }
    public void takeQuiz(){
        System.out.println("Taking the "+topic+ " quiz");
    }

    @Override
    public String toString() {
        return "Quiz | " +
                  topic + "quiz with "+
                + totalNumberOfQuestions+  " questions for a total of "+
                 + totalPoint +" totalPoint=";
    }


}
