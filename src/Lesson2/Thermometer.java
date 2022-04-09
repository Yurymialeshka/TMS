package Lesson2;

import java.util.Scanner;

public class Thermometer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double degCelsius = getDouble();
    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double degCelsius;
        if (scanner.hasNextDouble()) {
            degCelsius = scanner.nextDouble();
            System.out.println(degCelsius + " \u2103" + " = " + (degCelsius * 1.8 + 32) + " \u2109");
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            degCelsius = getDouble();
        }
        return degCelsius;
    }
}