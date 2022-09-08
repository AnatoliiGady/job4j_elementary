package ru.job4j.array;

public class JavaNameValidator {
    public static void main(String[] args) {
        String name = "First";
        System.out.println(isNameValid(name));
    }

    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        if (!name.isEmpty() && isLowerLatinLetter(name.charAt(0))) {
            for (char index : array) {
                if (isSpecialSymbol(index) || isUpperLatinLetter(index) || isLowerLatinLetter(index) || Character.isDigit(index)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 95 && code <= 122) {
            return true;
        }
        return false;
    }
}
