package zzapr;

import java.util.Scanner;

public class MultiplicationTable {
    static final String formatTableElement = "%6d";
    static final int formatTableElementCount = 6;

    public static void main(String[] args) {
        //TODO Write a program that will list multiplication table for defined
        // values, e.g. <0, 10>, <100, 120>
        Scanner input = new Scanner(System.in);

        System.out.print("Write from which value to start the table: ");
        int start = input.nextInt();
//        int start = 1;

        System.out.print("Write from which value to end the table with: ");
        int end = input.nextInt();
//        int end = 10;
        System.out.println();

        if (start < end) {
            System.out.println(MultiplicationTable.getRowHeader(start, end));
            for (int i = start; i <= end; i++) {
                System.out.printf("%4d", i);
                System.out.print("|");
                //columns
                for (int j = start; j <= end; j++) {
                    System.out.printf(MultiplicationTable.formatTableElement, i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong values for starting and end point entered!!!");
        }
    }

    static String getRowHeader(int start, int end) {
        String result = "";

        if (start < end) {
            for (int i = 0; i < (MultiplicationTable.formatTableElementCount - 1); i++) {
                result += " ";
            }
            for (int i = start; i <= end; i++) {
                result += String.format(MultiplicationTable.formatTableElement, i);
            }
            result += "\n";

            for (int i = 0; i < (MultiplicationTable.formatTableElementCount - 1); i++) {
                result += " ";
            }

            for (int i = start; i <= end; i++) {
                for (int j = 0; j < MultiplicationTable.formatTableElementCount; j++) {
                    result += "-";
                }
            }

        }
        return result;
    }
}
