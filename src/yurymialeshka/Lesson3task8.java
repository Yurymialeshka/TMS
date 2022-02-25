package yurymialeshka;

import java.util.Scanner;

public class Lesson3task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи число: ");
        int a = sc.nextInt();
        System.out.println("Вы ввели: " + a);
        int b = 0;
        for (int i = 1; i <= a; i++) {
            b = b + i;
        }
        System.out.println("Сумма от 1 до введенного с консоли равна: " + b);
    }
}
