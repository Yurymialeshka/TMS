package Lesson4;

import java.util.Arrays;

public class Lesson4task7 {
    public static void main(String[] args) {

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int y = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = y;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
