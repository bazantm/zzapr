package zzapr.w04;

public class W04MatrixMain {
    public static void main(String[] args) {
        W04Matrix matrixA = new W04Matrix(4, 3);
        matrixA.generateRandomElements(-20, 20);

        System.out.println("Matrix A:");
        System.out.println(matrixA); //the same as next line


        W04Matrix matrixB = new W04Matrix(5, 3);
        matrixB.generateRandomElements(-20, 20);

        System.out.println("Matrix B:");
        System.out.println(matrixB); //the same as next line

        //TODO create matrix B and print it to the console

        //TODO create a method that will sum matrices and
        // returns a new sum matrix on its output
        W04Matrix matrixC = matrixA.sumMatrix(matrixB);
        if (matrixC != null) {
            System.out.print("matrix A + matrix B = ");
            System.out.println(matrixC);
        } else {
            System.out.println("It is impossible to calculate " +
                    "matrix A + matrix B because dimensions are " +
                    "not the same!!!");
        }


        //TODO add a new method for matrices multiplication
    }
}
