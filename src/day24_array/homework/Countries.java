package day24_array.homework;


public class Countries {
    public static void main(String[] args) {
        String [] countries={"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal"};
        for(int i=0; i<countries.length; i++){
            int num=countries[i].length();
            System.out.println(countries[i].charAt(0) +"" +countries[i].charAt(num-1));
            if(num%2==0) {

                System.out.println(countries[i].charAt(num/ 2 - 1) +""+ countries[i].charAt(num / 2));
            }else{
                System.out.println(countries[i].charAt(num / 2));
            }
            System.out.println(countries[i].toCharArray());

        }
    }
}
