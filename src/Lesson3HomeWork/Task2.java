package Lesson3HomeWork;

import java.util.Scanner;

// Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число до которого нужно отобразить числа Фибоначчи: ");
        int maxFibNum = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int sumFirstAndSecond;
        for (int i = 0; i < maxFibNum; i++) {
            if (i == 0) {
                System.out.print("Числа Фибоначчи : ");
            } else {
                System.out.print(firstNum + " ");
                sumFirstAndSecond = firstNum + secondNum;
                secondNum = firstNum;
                firstNum = sumFirstAndSecond;
            }
        }
    }
}