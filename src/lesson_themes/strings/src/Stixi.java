package lesson_themes.strings.src;

public class Stixi {
    public static void main(String[] args) {
        String stix = " Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                "В альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...";
        System.out.println(stix.replace("В", ":-)"));

        evenLetter(stix);


        String [] masStix = stix.split("альбом");
        System.out.println(masStix.length - 1);
  }
  public static void evenLetter(String str) {
      char arr[] = str.toCharArray();
      for (int i = 0; i < arr.length; i++) {
          if (i % 2 == 0) {
              System.out.print(arr[i]);
          }
      }
  }
}
