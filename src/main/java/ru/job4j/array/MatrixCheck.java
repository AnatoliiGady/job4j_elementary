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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
