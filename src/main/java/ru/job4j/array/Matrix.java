package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] date = new int[size][size];
        for (int row = 0; row <= size - 1; row++) {
            for (int cell = 0; cell <= size - 1; cell++) {
                date[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return date;
    }
}

