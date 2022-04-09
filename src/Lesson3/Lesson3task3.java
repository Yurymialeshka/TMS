package Lesson3;
import java.util.Scanner;

public class Lesson3task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        if (x % 2==1) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
    }
}
