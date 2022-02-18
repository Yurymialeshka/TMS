package yurymialeshka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);

        System.out.println("Будь так добр, введи слово <user>:");

        String user = sc.next("<user>");

        System.out.println("Hello " + user + " !");

        sc.close();
    }
}

