package com.ifmo.lesson2;

import java.util.Scanner;

public class Dividers {
    /*
    Выведите на экран все положительные делители натурального числа, введённого
    пользователем с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("Число " + n + " делится на ");
        for (int i = n; i > 0; i--) {
            int div=n%i;
            if(div==0)
                System.out.println(i);
        }
    }
}
