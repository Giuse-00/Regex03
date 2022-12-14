package it.develhope.regex3;

public class Start {

    public static void main(String[] args) {

        String x = "are you able to climb, are you able to swim or are you able to fly?";

        String b = x.replaceAll(" are", "_XYZ");

        System.out.println(b);
    }
}
