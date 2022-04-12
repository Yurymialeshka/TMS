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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == delElement) {
                found = true;
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }

            }
        }
        if (!found) {
            System.out.println("Такого числа в массиве нет!");
        } else
            System.out.println("Массив с удаленными чмслами: " + Arrays.toString(newArr));
    }
}

