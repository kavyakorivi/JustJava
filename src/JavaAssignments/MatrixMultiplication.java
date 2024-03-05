package JavaAssignments;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2, 3},
                {4, 5, 6} };

        int[][] matrixB = { {7, 8},
                {9, 10},
                {11, 12} };

        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int columnsB = matrixB[0].length;

        if (columnsA != rowsB) {
            System.out.println("Cannot multiply the matrices. Invalid dimensions.");
            return;
        }

        int[][] result = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

