public class TransposeMatrix {
    public static void main(String[] args) {
        // Given matrix
        int[][] originalMatrix = {
                { 3, 4, 4 },
                { 0, 0, 5 },
                { 0, 2, 0 },
                { 1, 1, 3 },
                { 2, 0, 0 }
        };

        // Transpose the matrix
        int[][] transposeMatrix = transpose(originalMatrix);

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(originalMatrix);

        // Display the transpose matrix
        System.out.println("\nTranspose Matrix:");
        displayMatrix(transposeMatrix);
    }

    // Function to compute the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize a new matrix to store the transpose
        int[][] transposeMatrix = new int[cols][rows];

        // Compute the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
