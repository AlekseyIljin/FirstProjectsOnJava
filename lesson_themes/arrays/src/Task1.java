import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Type any number - ");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
            int n = in.nextInt();
            int n_1 = n % 2;
            switch (n_1) {
                case (1):
                    System.out.println("Нечетное число");
                    break;

                case (0):
                    System.out.println("Четное число");
                    break;
            }
            System.out.println("Еще!");
        }
    }

}
