package ru.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 195;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 195 is " + man);
        System.out.println("Woman 195 is " + woman);
    }
}
