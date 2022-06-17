package Lesson3HomeWork;

import java.util.Scanner;

/*
        Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день. (Необходимо использовать Scanner)
        Программа должна выводить:
        a. Количество дней
        b. Сумму осадков за этот период
        c. Среднее количество осадков за этот период
        d. Максимальное количество дневных осадков за этот период
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите величину осадков в день: ");
        int rainInDay = sc.nextInt();
       int rainInDay1 = (int) (Math.random() * rainInDay);
        System.out.println(rainInDay1);
        System.out.print("Введите количество дней: ");
        int amountOfDay = sc.nextInt();

        System.out.println("Всего дней: " + amountOfDay);
        System.out.println("Сумма осадков за период : " + rainInDay * amountOfDay);
        System.out.println("Среднее количество осадков за период : " + rainInDay*amountOfDay/amountOfDay);

    }
}
