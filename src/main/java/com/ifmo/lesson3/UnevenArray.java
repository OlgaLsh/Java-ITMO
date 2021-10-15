package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();

        for (int k : unevenArray) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = unevenArray.length-1; i >= 0; i--) {
            System.out.print(unevenArray[i]+" ");
        }
    }

    public static int[] unevenArray() {
        int n = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                n++;
            }
        }
        int[] Arr = new int[n];
        for (int i = 1, a = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Arr[a] = i;
                a++;
            }
        }
        return Arr;

        //return new int[0];
    }
}
