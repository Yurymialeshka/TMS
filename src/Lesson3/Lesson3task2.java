package yurymialeshka;

import java.util.Scanner;

public class Lesson3task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца:");

        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Пора года: зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Пора года: весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Пора года: лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Пора года: осень");
        } else {
            System.out.println("Что-то не то)");
        }
    }
}


