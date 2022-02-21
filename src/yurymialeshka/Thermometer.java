package yurymialeshka;

import java.util.Scanner;

public class Thermometer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение \u2103 :");

        double degCelsius = sc.nextDouble();

        System.out.println(degCelsius + " \u2103" + " = " + (degCelsius * 1.8 + 32) + " \u2109");

        sc.close();
    }
}