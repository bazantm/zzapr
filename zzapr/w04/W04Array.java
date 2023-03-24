package zzapr.w04;

import zzapr.utils.RandomGenerator;

import java.util.Arrays;

public class W04Array {

    private int[] elements;

    public W04Array(int arraySize) {
        this.elements = new int[arraySize];
    }

    void generateRandomValuesToArray(int from, int to) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = RandomGenerator.getRandomNumber(from, to);
        }
    }

    void printArrayValues() {
        System.out.println(Arrays.toString(elements));
    }


    static void arrayOpositeDirection(int[] array) {
        int last = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[last];
            array[last] = tmp;

            last = last - 1;
        }
    }

    //TODO Write a method that generates random values to a given array using defined method
    // in utils package


    //TODO Write a method prints array values to console


    // TODO Week assignment:
    // 1. Generate array elements randomly
    // 2. Write generated values to console
    // 3. Sort array values in ascending order using your own algorithm
    // 4. Write sorted values to console
    // 5. Sort array values in descending order using your own algorithm
    // 6. Write sorted values to console
    // !!! For all operations design and use its own method - no long code in main method !!!
    // ! Again I highly recommend to solve more examples on arrays at www.codingbat.com
}
