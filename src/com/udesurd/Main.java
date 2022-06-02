package com.udesurd;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1_7();
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

    private static void task1_2() {
        System.out.println("2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим\n" +
                "числом. Подсчитать количество замен.\n");
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int Z = 7;
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
            System.out.println(array[i]);
        }
        System.out.println("Count: "+count);

    }

    private static void task1_3(){
        System.out.println("3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов.");
        int [] array = new int[] {-3, -2, -1, 0, 1, 2, 3};
        int negativeCount =0;
        int positiveCount =0;
        int nullCount = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else
                nullCount++;
        }
        System.out.println("В данном массиве чисел " + negativeCount +" отрицательных чисел, " + positiveCount+" положительных и " +nullCount+ "нулевых чисел.");
    }

    private static void task1_4(){
        System.out.println("4.  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.");
        int [] array = new int[] { 0, 1, 2, 3, 4, 5};
        int min=0;
        int max=0;
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
            if (array[i] > max)
                max = array[i];

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("-------");
        int temp =array[max];
        array[max]=array[min];
        array[min] = temp;
        for (int j=0; j<array.length; j++)
            System.out.println(array[j]);
    }

    private static void task1_5() {
        System.out.println("5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.");
        int a []= new int [] {5, 2, 8, 5, 3, 9, 7, 8, 9};
        for (int i = 0; i < a.length; i++)
            if (a[i]>i)
                System.out.println(a[i]);
    }

    private static void task1_6() {
        System.out.println("6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых\n" +
                "являются простыми числами.");

        double num = 100;
        double sum = 0;
        {
            for (int i = 0; i < num; i++)
                if (isPrime(i))
                    sum += i;
        }
        System.out.println(sum);


    }

    private static void task1_7(){
        System.out.println("7. Даны действительные числа а1, а2, ..., аn. Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).");
        int arr []= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxSum = arr[0] + arr[arr.length-1];
        for (int i=0; i<arr.length; i++)
            if (maxSum < (arr[i] + arr[arr.length - i - 1]))
                maxSum = arr[i] + arr[arr.length-i-1];


        System.out.println(maxSum);
    }









//  Использовал готовый алгоритм поиска простого числа*
    private static boolean isPrime(int i) {
        if (i <= 3) {
            return i > 1;
        } else if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }

        int tmp = 5;

        while (tmp * tmp <= i) {
            if (i % tmp == 0 || i % (tmp + 2) == 0) {
                return false;
            }
            tmp += 6;
        }
        return true;
    }   }