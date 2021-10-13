package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        //int[] fibonacciNumbers = fibonacciNumbers();


        int[] Arr=new int[20];
        int i;
        for(i=0;i<Arr.length;i++){
            if(i<2){
                Arr[i]=1;
            }
            else {
                Arr[i]=Arr[i-2]+Arr[i-1];
            }
            System.out.println(Arr[i] + " ");
    }

    //public static int [] fibonacciNumbers() {
//        int[] Arr=new int[20];
//        int i;
//        for(i=0;i<Arr.length;i++){
//            if(i<2){
//                Arr[i]=1;
//            }
//            else {
//                Arr[i]=Arr[i-2]+Arr[i-1];
//            }
//            //return Arr;
//        }
//
//        //return new int[0];

    }

}
