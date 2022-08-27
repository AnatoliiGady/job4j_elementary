package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Anatolii Gady";
        names[1] = "1990";
        names[2] = "Neryungri";
        names[3] = "Engineer - energy";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("размер массива равен: " + ages.length);
        System.out.println("размер массива равен: " + surname.length);
        System.out.println("размер массива равен: " + prices.length);

    }
}
