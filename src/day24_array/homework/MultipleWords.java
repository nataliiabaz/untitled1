package day24_array.homework;

public class MultipleWords {
    public static void main(String[] args) {
        String str="knife, wooden spoons, plates, cup, forks, pan, pot, trash can, fridge, dish washer";
        String [] words=str.split(", ");


        for (int i = 0; i < words.length ; i++) {
            if(words[i].contains(" ") ){
                System.out.println( words[i]);
            }


        }
    }
}
