package day10_multiBranch;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number based on the language you wanted to use");
        System.out.println("1-English \n 2-Spanish \n 3-Turkish \n 4-Russian \n 5-French ");
        int num=scan.nextInt();
        if (num == 1){
            System.out.println("Hello, thank for your call");
        } else if (num == 2){
            System.out.println("Hola, gracias para llamar");
        } else if (num == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (num == 4){
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (num == 5){
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("Invalid Number");
        }
    }


    }

