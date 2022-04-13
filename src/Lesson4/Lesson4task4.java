package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива(должен быть больше 5 и меньше или равно 10): ");
        int sizeArr = sc.nextInt();
        if (sizeArr < 5 || sizeArr > 10) {
            System.out.print("Ебанько! Больше 5 и меньше или равно 10. Вводи еще раз: ");
            sizeArr = sc.nextInt();
        }
        int[] arr1 = new int[sizeArr];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr1));

        int attemps = 0;
        for (int i : arr1) {
            if (i % 2 == 1) {
                attemps++;
            }
        }
        int[] arr2 = new int[arr1.length - attemps];
        int u = 0;
        for (int r : arr1) {
            if (r % 2 == 0) {
                arr2[u] = r;
                u++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
