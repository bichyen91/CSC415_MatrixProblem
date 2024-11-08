package csc415_matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CSC415_Matrix {

    public static void setZeros(int[][] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> position = new HashMap<>();
        List<Integer> col;
        for (int r = 0; r < n; r++) {
            col = new ArrayList<>();
            for (int c = 0; c < n; c++) {
                if (arr[r][c] == 0) {
                    col.add(c);
                }
            }
            if (!col.isEmpty()) {
                position.put(r, col);
            }
        }

        for (Integer r : position.keySet()) {
            for (Integer c : position.get(r)) {
                for (int i = 0; i < n; i++) {
                    arr[i][c] = 0;
                    arr[r][i] = 0;
                }
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
        System.out.println("Initial array A: ");
        printArray(arrA);
        setZeros(arrA);
        System.out.println("\nRevised array A: ");
        printArray(arrA);

        System.out.println("\n");
        System.out.println("Initial array B: ");
        printArray(arrB);
        setZeros(arrB);
        System.out.println("\nRevised array B: ");
        printArray(arrB);
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
