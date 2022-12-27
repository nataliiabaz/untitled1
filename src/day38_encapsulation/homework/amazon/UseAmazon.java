package day38_encapsulation.homework.amazon;

import day38_encapsulation.homework.amazon.AmazonAccount;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount useAmazon=new AmazonAccount();

        useAmazon.setUserName("Nataliia");
        useAmazon.setEmail("bazelnataly@gmail.com");
        useAmazon.setHasPrime(true);
        System.out.println(useAmazon.getUserName());
        System.out.println(useAmazon.getEmail());
        System.out.println(useAmazon.isHasPrime());
        System.out.println(useAmazon.toString());
    }
}




