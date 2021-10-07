package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /*
    В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n = 123;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {
        int a = n/100;
        int b = (n%100)/10;
        int c = (n%100)%10;

        return a+b+c;
    }
}
