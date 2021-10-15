package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();
        for (int k : evenArray) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int k : evenArray) {
            System.out.println(k);
        }
    }
    public static int [] evenArray() {
        int n = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                n++;
            }
        }
        int[] Arr = new int[n];
        for (int i = 2, a = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Arr[a] = i;
                a++;
            }
        }
        return Arr;

    }

}
