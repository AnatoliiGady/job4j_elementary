package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEvro = 140;
        float expectedEvro = 2;
        float outEvro = Converter.rubleToEuro(inEvro);
        boolean passedEvro = expectedEvro == outEvro;
        System.out.println("140 rubles are 2. Test result : " + passedEvro);
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}
