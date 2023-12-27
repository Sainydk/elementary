package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int s = start; s <= finish; s++) {
            sum = sum + s;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}