package zzapr.w04;

import zzapr.utils.RandomGenerator;


// TODO Task for this week is about matrix using instance
// variables
public class W04Matrix {
    private int[][] elements;

    public W04Matrix(int numberOfRows, int numberOfColumns) {
        if (0 < numberOfRows && 0 < numberOfColumns) {
            elements = new int[numberOfRows][numberOfColumns];
        }
    }

    public void generateRandomElements(int from, int to) {
        for (int i = 0; i < elements.length; i++) { //iterate rows
            for (int j = 0; j < elements[0].length; j++) { //iterate columns
                elements[i][j] = RandomGenerator.getRandomNumber(from, to);
            }
        }
    }

    public boolean dimensionAreTheSame(W04Matrix anotherMatrix) {
        boolean result = true;

        return result;
    }

    public W04Matrix sumMatrix(W04Matrix anotherMatrix) {
        W04Matrix resultM = null;

        //!!!  need to check if the operation is allowed
        if (dimensionAreTheSame(anotherMatrix)) {
            //DO THE SUM
        }

        return resultM;
    }


    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                text += String.format("%6d", elements[i][j]);
            }
            text += "\n";
        }

        return text;
    }
}
