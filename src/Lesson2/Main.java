package Lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");

        String user = sc.nextLine();

        System.out.println("Hello " + user + " !");

        sc.close();
    }
}

