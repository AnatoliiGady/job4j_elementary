package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] bord, int row) {
        boolean result = true;
        for (int cell = 0; cell < bord.length; cell++) {
            if (bord[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] bord, int column) {
        boolean result = true;
        for (int row = 0; row < bord.length; row++) {
            if (bord[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
