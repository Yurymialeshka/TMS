package yurymialeshka;
import java.util.Scanner;

public class Lesson3task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");

        int month = sc.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Введено число больше 12 или меньше 1 или введенное значение не является численным";
        }
        System.out.println("Пора года: " + season);

    }
}
