package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("размер массива равен: " + ages.length);
        System.out.println("размер массива равен: " + surname.length);
        System.out.println("размер массива равен: " + prices.length);
    }
}
