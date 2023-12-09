#include <stdio.h>

// Function to print a matrix
void printMatrix(int *matrix, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d\t", *(matrix + i * cols + j));
        }
        printf("\n");
    }
}

// Function to add two matrices
void addMatrices(int *mat1, int *mat2, int *result, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            *(result + i * cols + j) = *(mat1 + i * cols + j) + *(mat2 + i * cols + j);
        }
    }
}

// Function to subtract two matrices
void subtractMatrices(int *mat1, int *mat2, int *result, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            *(result + i * cols + j) = *(mat1 + i * cols + j) - *(mat2 + i * cols + j);
        }
    }
}

// Function to multiply two matrices
void multiplyMatrices(int *mat1, int *mat2, int *result, int rows1, int cols1, int rows2, int cols2) {
    if (cols1 != rows2) {
        printf("Invalid matrix multiplication: Number of columns in the first matrix must be equal to the number of rows in the second matrix.\n");
        return;
    }

    for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < cols2; j++) {
            *(result + i * cols2 + j) = 0;

            for (int k = 0; k < cols1; k++) {
                *(result + i * cols2 + j) += *(mat1 + i * cols1 + k) * *(mat2 + k * cols2 + j);
            }
        }
    }
}

int main() {
    int mat1[3][2] = {{1, 2}, {3, 4}, {5, 6}};
    int mat2[2][3] = {{7, 8, 9}, {10, 11, 12}};

    int rows1 = 3, cols1 = 2;
    int rows2 = 2, cols2 = 3;

    int resultAdd[3][2];
    int resultSubtract[3][2];
    int resultMultiply[3][3];

    addMatrices(&mat1[0][0], &mat2[0][0], &resultAdd[0][0], rows1, cols1);
    printf("Matrix Addition:\n");
    printMatrix(&resultAdd[0][0], rows1, cols1);
    printf("\n");

    subtractMatrices(&mat1[0][0], &mat2[0][0], &resultSubtract[0][0], rows1, cols1);
    printf("Matrix Subtraction:\n");
    printMatrix(&resultSubtract[0][0], rows1, cols1);
    printf("\n");

    // Multiply matrices
    multiplyMatrices(&mat1[0][0], &mat2[0][0], &resultMultiply[0][0], rows1, cols1, rows2, cols2);
    printf("Matrix Multiplication:\n");
    printMatrix(&resultMultiply[0][0], rows1, cols2);

    return 0;
}
