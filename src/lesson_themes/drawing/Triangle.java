package lesson_themes.drawing;

public class Triangle {
    public static void main(String[] args) {
        int width = 0;
        while(width < 10){
            for (int i = 0; i < 10-width; i++) {
                System.out.print(" ");  // поставьте здесь вместо пробела i, чтобы проверить, что середина на 20-м символе
            }
            for (int i = 0; i < width*2 + 1; i++) {
                System.out.print("8");
            }
            System.out.println();
            width++;
        }
    }
}
