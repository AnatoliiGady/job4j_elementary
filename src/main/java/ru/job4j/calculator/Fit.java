package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110.0) * 1.15;
    }

    public static void main(String[] args) {
        short heigh = 176;
        double man = Fit.manWeight(heigh);
        short height = 170;
        double woman = Fit.womanWeight(height);
        String resultMan = String.format("%.1f", man);
        System.out.println("Man 176 is " + resultMan);
        String resultWoman = String.format("%.1f", woman);
        System.out.println("Woman 170 is " + resultWoman);
    }
}
