package yurymialeshka;

import java.util.Scanner;

public class Lesson3task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");

        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Введено число больше 12 или меньше 1");
        }
    }
}

