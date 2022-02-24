package yurymialeshka;
import java.util.Scanner;

public class Lesson3task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int t = sc.nextInt();
        if (t > -4) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}

