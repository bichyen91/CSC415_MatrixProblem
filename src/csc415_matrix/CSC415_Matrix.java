package csc415_matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CSC415_Matrix {

    public static void setZeros(int[][] arr) {
        int n = arr.length;
        List<Integer> row = new ArrayList<>();
        HashSet<Integer> col = new HashSet();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (arr[r][c] == 0) {
                    row.add(r);
                    if (!col.contains(c)) {
                        col.add(c);
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (Integer r : row) {
                arr[r][i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (Integer c : col) {
                arr[i][c] = 0;
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int[] r : arr) {
            for (int c = 0; c < r.length; c++) {
                System.out.print(r[c] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int[][] arrA = {
            {3, 2, 1, 4},
            {7, 0, 3, 6},
            {5, 2, 0, 6},
            {7, 8, 2, 7}
        };

        int[][] arrB = {
            {3, 2, 1, 4, 5, 8, 2, 1},
            {7, 0, 3, 6, 5, 0, 3, 6},
            {5, 2, 4, 0, 5, 5, 6, 4},
            {5, 2, 1, 6, 1, 4, 1, 7},
            {5, 2, 1, 5, 5, 8, 2, 0},
            {7, 0, 3, 8, 7, 1, 9, 4},
            {5, 2, 3, 4, 9, 5, 2, 4},
            {5, 2, 1, 6, 3, 2, 4, 6}
        };
        System.out.println("Original matrix A: ");
        printArray(arrA);
        setZeros(arrA);
        System.out.println("\nMatrix A after cleaning: ");
        printArray(arrA);

        System.out.println("\n");
        System.out.println("Original matrix B: ");
        printArray(arrB);
        setZeros(arrB);
        System.out.println("\nMatrix B after cleaning: ");
        printArray(arrB);
        System.out.println("");
    }
}

//    public boolean isSafe(int[][] board, int col, int row) {
//        //Checking horizotal
//        for (int c = 0; c < board[row].length; c++) {
//            if (board[row][c] == 1) {
//                return false;
//            }
//        }
//        //Check Vertical
//        for (int r = 0; r < board.length; r++) {
//            if (board[r][col] == 1) {
//                return false;
//            }
//        }
//
//        //Check /
//        //check \
//    }
