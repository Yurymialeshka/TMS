package yurymialeshka;

public class Lesson3task12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= 11; i++) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
