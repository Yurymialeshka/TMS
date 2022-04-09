package yurymialeshka;

import java.util.Scanner;

public class Lesson3task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float persentInMonth;
        float persent = 0.07f;
        System.out.print("Введите количество месяцев вклада: ");
        int numMonth = sc.nextInt();
        System.out.print("Введите сумму вклада: ");
        float numDeposit = sc.nextFloat();
        for (int i = 1; i <= numMonth; i++) {
            persentInMonth = numDeposit * persent;
            numDeposit = numDeposit + persentInMonth;
        }
        System.out.println("Конечная сумма вклада с учетом процентов: " + numDeposit);
    }
}
