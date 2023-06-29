package com.example.demo;

public class ElementIndexIn2DArray {
    public static void main(String args[]) {

        int mat[][] = {{10, 20, 30, 40},

                {15, 25, 35, 45},

                {27, 29, 37, 48},

                {32, 33, 39, 50}};

        findElementIndex(mat, 29);

    }


    public static void findElementIndex(int[][] mat, int key) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == key) {
                    System.out.println("Found At (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element is not available in the array");
    }

}
