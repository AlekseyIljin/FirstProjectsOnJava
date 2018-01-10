package lesson_themes.arrays;

public class BigArrayOfNumbers {
    public static void main(String[] args) {
        short sto[] = new short[101];
        for(short i = 100; i != 0;i--){
            System.out.print(i+" ");
            sto[i] = i;
        }

        System.out.println("-----");
        for (short i : sto) {
            System.out.println(i+" ");
        }
    }
}
