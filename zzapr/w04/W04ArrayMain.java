package zzapr.w04;

import java.util.Scanner;

public class W04ArrayMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("How many elements to have " +
                "in the array? ");
        int elementCount = input.nextInt();

        W04Array arrayObject = new W04Array(elementCount);

        arrayObject.generateRandomValuesToArray(-10, 10);
        arrayObject.printArrayValues();

    }

}
