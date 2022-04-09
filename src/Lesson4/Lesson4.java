package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attemps = 0;
        int computerChoice = random.nextInt(100) + 1;
        while (true) {
            attemps++;
            System.out.println("Количество попыток: " + attemps);
            System.out.print("0- выход;Выберете число: ");

            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("На выход...");
                break;
            }
            System.out.println("Вы выбрали:" + num);

            if (computerChoice == num) {
                System.out.println("Победа");
                break;
            } else if (computerChoice > num) {
                System.out.println("Больше");
                continue;
            } else if (computerChoice < num) {
                System.out.println("Меньше");
                continue;
            }
        }
    }
}
