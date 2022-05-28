package com.udesurd;

public class Main {
    public static void main(String[] args) {
        task1_1();
    }

    private static void task1_1(){
        System.out.println("1.  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К");
        int k = 2;
        int[] array = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                s += array[i];
            }
        }
        System.out.println("Сумма элементов, кратные" + k + ", равна " + s);
    }
}