import java.util.Scanner;

import static java.lang.Math.abs;


public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число n, пожалуйста -");
        double n = in.nextDouble();

        System.out.println("Теперь m, будьте добры - ");
        double m = in.nextDouble();

        double n_10 = abs(n-10);
        double m_10 = abs(m-10);

        if(m_10<n_10){
            System.out.println(m);
        }
        else if(n_10<m_10){
            System.out.println(n);
        }
        else if(n_10==m_10){
            System.out.println("it doesn't matter what number you choose");
        }
    }
}
