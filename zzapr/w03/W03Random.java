package zzapr.w03;

import zzapr.utils.RandomGenerator;

import java.util.Scanner;

public class W03Random {
    public static void main(String[] args) {
        System.out.println("Random numbers");

        //TODO Write a code where you ask a user how many random numbers
        // he wants to generate and from which interval and write
        // generated values to console

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to generate? ");
        int count = input.nextInt();

        if (0 < count && count <= 100) {
            System.out.print("Lower value of generated values? ");
            int lower = input.nextInt();
            System.out.print("Upper value of generated values? ");
            int upper = input.nextInt();

            if (lower < upper) {
                for (int i = 0; i < count; i++) {
                    System.out.println(RandomGenerator.getRandomNumber(lower, upper));
                }
            } else {
                System.out.println("Wrong input!!!");
            }
        }
    }
}
