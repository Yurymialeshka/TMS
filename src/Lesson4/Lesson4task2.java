package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        System.out.println("Вот такой массив: " + Arrays.toString(arr));

        int min = arr[0];
        for (int i : arr) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i : arr) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        double t = 0;
        for (int j : arr) {
            t = (arr[j] + t);
        }
        t = t / arr.length;

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимально значение массива: " + max);
        System.out.println("Среднее значение массива: " + t);

    }
}