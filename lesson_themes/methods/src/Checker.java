import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        Check(b);
    }
    public static void Check(int a){
        boolean check = true;
        if (a > 5){

            System.out.println(check);
        }
        else if (a < 5){
            check = false;
            System.out.println(check);
        }
        else if (a == 5){
            System.out.println("Try again");
        }

    }
}
