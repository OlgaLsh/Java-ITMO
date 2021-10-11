package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        int n = 0;
        for (int hour = 1; hour <=24 ; hour++) {
            for (int min = 0; min <60 ; min++) {
                if(hour/10%10 == min%10 && hour%10 == min/10%10){
                    n++;
                }
            }
            
        }
        return n;
    }
}
