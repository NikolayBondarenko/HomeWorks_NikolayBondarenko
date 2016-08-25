package com.levelup.lesson3.task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nikolay on 20.08.2016.
 */
class ArraySout {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in, "IBM866");
        int size;
        // считываем размер матрицы
        System.out.print("Введите порядок матрицы: ");
        try {
            size = Integer.parseInt(scr.nextLine());
            int[][] arr = new int[size][size];
            // цикл по первой размерности
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    //инициализация элементов массива
                    if (i == j)
                        arr[i][j] = 1;
                    if (i + j == arr.length - 1)
                        arr[i][j] = 1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            //обработка исключений
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер матрицы! \n" + e);
        } catch (OutOfMemoryError e) {
            System.out.println("Матрица слишком большого размера! \n" + e);
        } catch (NumberFormatException e) {
            System.out.println("Вы вводите буквы! \n" + e);
        }
    }
}
