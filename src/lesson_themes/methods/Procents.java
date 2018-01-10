package lesson_themes.methods;
import java.util.Scanner;
public class Procents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое нужно увеличить на 10 процентов");
        int a = in.nextInt();
        System.out.println(calc(a));
    }
    public static double calc(int b){
        double res=b*1.1;
        return res;
    }
}
