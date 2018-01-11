package lesson_themes.drawing;

public class Table {
    public static void main(String[] args) {
        multiplication();
        System.out.print("\nИ реверс\n");
        reverseMultiplication();
    }

    public static void multiplication() {
        for (int i = 1; i <= 10; i++) {
                for(int j = 0;j<=10;j++){
                    int c= 0;
                     c = i*j;
                    System.out.print("|   "+i+"*"+j+"="+c+"   |"+"\t");
                }
            System.out.println("\t");
        }
    }

    public static void reverseMultiplication(){
        for (int i = 10; i >0; i--) {
            for(int j = 10;j>=0;j--){
                int c= 0;
                c = i*j;
                System.out.print("|   "+i+"*"+j+"="+c+"   |"+"\t");
            }
            System.out.println("\t");
        }
    }
}