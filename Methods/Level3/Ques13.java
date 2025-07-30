// Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
import java.util.Random;

public class Ques13{

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        return result;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1]*A[2][2] - A[1][2]*A[2][1])
             - A[0][1] * (A[1][0]*A[2][2] - A[1][2]*A[2][0])
             + A[0][2] * (A[1][0]*A[2][1] - A[1][1]*A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double)det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int r = 0, mr = 0; r < 3; r++) {
                    if (r == i) continue;
                    for (int c = 0, mc = 0; c < 3; c++) {
                        if (c == j) continue;
                        minor[mr][mc++] = A[r][c];
                    }
                    mr++;
                }
                double cofactor = Math.pow(-1, i + j) * determinant2x2(minor);
                inv[j][i] = cofactor / det;
            }
        return inv;
    }

    public static void displayMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("Determinant of A:");
        System.out.println(determinant3x3(A));
        System.out.println();

        System.out.println("Inverse of A:");
        double[][] invA = inverse3x3(A);
        if (invA != null)
            displayMatrix(invA);
        else
            System.out.println("Inverse does not exist.\n");
    }
}
