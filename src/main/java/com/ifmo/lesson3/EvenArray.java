package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        //int[] evenArray = evenArray();
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
                System.out.print(Arr[a] + " ");
                a++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
//    public static int [] evenArray {
//
//    }

}
