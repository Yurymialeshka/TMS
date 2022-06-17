package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число на которое будет увеличиваться элемент : ");
        int num = sc.nextInt();
        int[][][] dimArr = {{{3, 4, 6}, {3, 5, 7}, {4, 5, 6}}};
        System.out.println(Arrays.deepToString(dimArr));
        for (int[][] i : dimArr) {
            for (int[] j : i) {
                for (int k : j) {
                    k += num;
                    System.out.print(k + " ");
                }
            }
        }
    }
}


