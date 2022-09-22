package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, second) >= third ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int four) {
        return max(first, second, third) >= four ? max(first, second, third) : four;
    }

    public static void main(String[] args) {
        int x = Max.max(30, 50, 30, 100);
        System.out.println("Максимальное значение = " + x);
    }

}
