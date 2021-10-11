package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);

    }

    public static int threeDigitRandom() {
        Random random = new Random();

        return random.nextInt(899) + 100;
    }

    public static String largestDigit(int rnd) {
        int a = rnd / 100;
        int b = (rnd % 100) / 10;
        int c = (rnd % 100) % 10;
        int max;


        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {

            max = b;
        } else {
            max = c;
        }


        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
