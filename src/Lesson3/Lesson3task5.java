package yurymialeshka;

import java.util.Scanner;

public class Lesson3task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("Красный");
        } else if (c == 2) {
            System.out.println("Оранжевый");
        } else if (c == 3) {
            System.out.println("Желтый");
        } else if (c == 4) {
            System.out.println("Зеленый");
        } else if (c == 5) {
            System.out.println("Голубой");
        } else if (c == 6) {
            System.out.println("Синий");
        } else if (c == 7) {
            System.out.println("Фиолетовый");
        } else {
            System.out.println("Нет больше цветов у радуги");
        }
    }
}
