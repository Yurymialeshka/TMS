package yurymialeshka;

public class Lesson3task12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 9; ++i) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}
