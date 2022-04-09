package Lesson3;

import java.util.Scanner;

public class Lesson3task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        while (true) {
            if (sc.hasNextInt()) {
                int t = sc.nextInt();
                if (t > -5) {
                    System.out.println("Тепло");
                    break;
                } else if (t <= -5 && t > -20) {
                    System.out.println("Нормально");
                    break;
                } else if (t <= -20) {
                    System.out.println("Холодно");
                    break;
                }
            } else {
                String str = sc.next();
                System.out.print("Ошибка вы ввели " + str + " вместо числа, попробуйте еще раз :");
            }
        }
    }
}


