package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double rsl = (heightMan - 100.0) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightWoman) {
        double rsl = (heightWoman - 110.0) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 176;
        double man = Fit.manWeight(heightMan);
        short heightWoman = 170;
        double woman = Fit.womanWeight(heightWoman);
        String resultMan = String.format("%.1f", man);
        System.out.println("Man 176 is " + resultMan);
        String resultWoman = String.format("%.1f", woman);
        System.out.println("Woman 170 is " + resultWoman);
    }
}
