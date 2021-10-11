package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int fn;

        System.out.println(f2);
        System.out.println(f2);

        for (int i = 3; i <=11 ; i++) {
            fn = f1 + f2;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }

    }
}
