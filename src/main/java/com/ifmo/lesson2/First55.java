package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        int a = 0;
        int b = -1;
        while (a < 55) {
            b = b + 2;
            System.out.println(b);
            a++;
        }
    }
}
