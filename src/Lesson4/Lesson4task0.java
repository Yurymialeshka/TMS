package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {6, 4, 9, 5, 7, 3};
        System.out.println("Введите целое число: ");
        int number = sc.nextInt();
        Arrays.sort(array);
        int a = Arrays.binarySearch(array, number);
        if (a >= 0) {
            System.out.println("Такое число входит в массив");
        } else
            System.out.println(" Такого числа нет в массиве");

        boolean b = false;
        for (int c : array) {
            if (number == c) {
                b = true;
                System.out.println("Такое число входит в массив");
                break;
            }
        }
        if (!b ) {
            System.out.println("Такого числа нет в массиве");
        }
    }
}



