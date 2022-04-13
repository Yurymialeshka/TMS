package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int[] newArr = null;
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        System.out.println("Массив до удаления введенных значений: " + Arrays.toString(arr));
        System.out.print("Ведите число которое хотите удалить из массива: ");
        int delElement = sc.nextInt();
        boolean found = false;
        int attemps = 0;
        for (int i : arr) {
            if (i == delElement) {
                attemps++;
                found = true;
            }
        }
        newArr = new int[arr.length - attemps];




        if (!found) {
            System.out.println("Такого числа в массиве нет!");
        } else
            System.out.println("Массив с удаленными числами: " + Arrays.toString(newArr));

    }
}

