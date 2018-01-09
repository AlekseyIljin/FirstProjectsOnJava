public class Main {

    public static void main(String[] args) {
        System.out.println(firstStringMethod2("----"));

    }
    public static void firstMethod(){
        int a = 2;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);

    }
    public static String firstStringMethod(){
        String str = "str";
        return str;
    }
    public static String firstStringMethod2(String str){
        str = "sv str" + str;
        System.out.println(str);
        return str;
    }
}
