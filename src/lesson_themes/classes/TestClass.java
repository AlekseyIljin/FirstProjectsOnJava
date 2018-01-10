package lesson_themes.classes;

public class TestClass {
    public static void main(String[] args) {
        calc(3D, 4D);
    }
    public static void calc(int a, int b){
        System.out.println("int a, int b");
    }
    public static void calc(int a, String str){
        System.out.println("int a, String str");
    }
    public static void calc(double a, double b, double c){
        System.out.println("double a, double b, double c");
    }
    public static void calc(double a, double b){
        System.out.println("double a, double b");
    }
    public static void calc(int a ){
        System.out.println("Ничего нельзя сделать с одним числом");
    }
}
