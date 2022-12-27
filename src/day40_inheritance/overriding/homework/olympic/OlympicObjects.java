package day40_inheritance.overriding.homework.olympic;

public class OlympicObjects {
    public static void main(String[] args) {
        Track track=new Track("Track", 5);
        System.out.println(track);
        System.out.println(track.compete());
        Surfing surfing=new Surfing("Sutfing",6);
        System.out.println(surfing);
        System.out.println(surfing.compete());
        Soccer soccer=new Soccer("soccer", 12);
        System.out.println(soccer);
        System.out.println(soccer.compete());
    }
}