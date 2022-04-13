package Lesson4;

import java.util.Arrays;

public class Lesson4tas3 {
    public static void main(String[] args) {

        int[] one = {2, 3, 5, 8, 9};
        int[] two = {2, 3, 5, 8, 9};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        double averageOne = 0;
        for (int i : one) {
            averageOne += i;
        }

        double averageTwo = 0;
        for (int i : two) {
            averageTwo += i;
        }

        averageOne = averageOne / one.length;
        averageTwo = averageTwo / two.length;

        System.out.println(averageOne);
        System.out.println(averageTwo);

        if (averageOne > averageTwo) {
            System.out.println("Среднее значение первого массива больше второго");
        } else if (averageTwo > averageOne) {
            System.out.println("Среднее значение второго массива больше первого");
        } else {
            System.out.println("Они равны");
        }
    }
}
