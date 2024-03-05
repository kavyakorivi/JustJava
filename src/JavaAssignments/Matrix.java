package JavaAssignments;

public class Matrix {
    public static void main(String[] args) {
        // Define a sample 3x3 matrix
        int[][] matrix = {
                {11, 22, 23},
                {4, 5, 6},
                {7, 11, 0}
        };

        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= 2;
            }
        }
        System.out.println("Modified Matrix (Multiplied by 2):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

