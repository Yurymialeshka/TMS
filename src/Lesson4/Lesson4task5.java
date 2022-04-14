package Lesson4;

import java.util.Arrays;

public class Lesson4task5 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
