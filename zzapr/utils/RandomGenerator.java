package zzapr.utils;

public class RandomGenerator {
    //TODO Create a method that will generate random integer number from defined
    // interval <a, b>
    public static int getRandomNumber(int a, int b) {
        return (int) (a + (b - a) * Math.random());
    }

}
