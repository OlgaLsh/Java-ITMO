package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        while (a < 20) {
            b = b * 2;
            System.out.println(b);
            a++;
        }
    }
}
