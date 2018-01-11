package lesson_themes.drawing;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Таблица для какого числа вам нужна?");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        multiplication(b);
        System.out.println("\nИ реверс\n");
        reverseMultiplication(b);
    }

    public static void multiplication(int a) {
        for (int i = 0; i <= 10; i++) {
                int c = a*i;
            System.out.println("|   " + a+"*"+i + "=" + c + "   |");
        }
    }
    public static void reverseMultiplication(int a){
        for (int i = 10; i >=0; i--) {
            int c = a*i;
            System.out.println("|   " + a+"*"+i + "=" + c + "   |");
        }
    }
}